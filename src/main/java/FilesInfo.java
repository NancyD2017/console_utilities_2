import org.example.MyOptions;
import org.kohsuke.args4j.CmdLineException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesInfo {
    List<String> items = new ArrayList();

    public void main(String[] args) throws IOException, CmdLineException {
        MyOptions values = new MyOptions(args);
        File dirPath = new File(values.directory);
        boolean l = values.isLong;
        boolean h = values.humanReadable;
        boolean r = values.isReverse;
        boolean o = values.outputFileName != null;
        if (l) {
            isItLong(r, dirPath);
        }
        if (h) {
            isHumanReadable(r, dirPath);
        }
        if (o) {
            String answerPath = values.outputFileName;
            try (FileWriter writer = new FileWriter(answerPath)) {
                for (String it : items) {
                    writer.write(it + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (!o) System.out.println(items);
    }

    public File[] isDirectory(File dirPath) {
        if (!dirPath.isDirectory()) return new File[]{dirPath};
        else return dirPath.listFiles();
    }

    public void isItLong(boolean reverse, File dirPath) {
        for (File item : isDirectory(dirPath)) {
            Date date = new Date(item.lastModified());
            if (!reverse) {
                items.add(item.getName() + "\t" + getPermissions(item, true) + "\t" + date + "\t" + item.length() + " bytes");
            } else {
                items.add(item.length() + " bytes" + "\t" + date + "\t" + getPermissions(item, true) + "\t" + item.getName());
            }
        }
    }

    public void isHumanReadable(boolean reverse, File dirPath) {
        for (File item : isDirectory(dirPath)) {
            String len;
            if (item.length() > 2024 * 1024 * 1024) {
                len = item.length() / 1024 / 1024 / 1024 + " Gigabytes";
            } else if (item.length() > 2024 * 1024) {
                len = item.length() / 1024 / 1024 + " Megabytes";
            } else {
                len = item.length() / 1024 + " Kilobytes";
            }
            if (!reverse) {
                items.add(item.getName() + "\t" + getPermissions(item, false) + "\t" + len);
            } else {
                items.add(len + "\t" + getPermissions(item, false) + "\t" + item.getName());
            }
        }
    }

    public StringBuilder getPermissions(File item, boolean isLongOrHR) {
        StringBuilder xxx = new StringBuilder();
        if (isLongOrHR) {
            if (item.canRead()) {
                xxx.append(1);
            } else xxx.append(0);
            if (item.canWrite()) {
                xxx.append(1);
            } else xxx.append(0);
            if (item.canExecute()) {
                xxx.append(1);
            } else xxx.append(0);
        } else {
            if (item.canRead()) {
                xxx.append("r");
            } else xxx.append("-");
            if (item.canWrite()) {
                xxx.append("w");
            } else xxx.append("-");
            if (item.canExecute()) {
                xxx.append("x");
            } else xxx.append("-");
        }
        return xxx;
    }
}