import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Class {
    private List<String> items = new ArrayList();
    public File dir = new File("C:\\Users\\PC\\Downloads\\Telegram Desktop\\answer");        //добавить изменение имени
    public void main(boolean isLong, boolean humanReadable, boolean reverse, String output) {
            if (isLong) {
                isItLong(reverse);
            } else if (humanReadable) {
                isHumanReadable(reverse);
            }
            Collections.sort(items);
            if (output.isBlank()) {for (String it: items) {System.out.println(it);}} else {
                try(FileWriter writer = new FileWriter(output))
                {
                    for (String it: items) {
                        writer.write(it + "\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
        public File[] isDirectory() {
        if (!dir.isDirectory()) return File[dir];
        else return dir.listFiles();
        }
    public void isItLong(boolean reverse) {
        for (File item : dir.listFiles()) {
            Date date = new Date(item.lastModified());
            if (!reverse) {items.add(item.getName() + "\t" + getPermissions(item, true) + "\t" + date + "\t" + item.length() + " bytes");} else {
                items.add(item.length() + " bytes" + "\t" + date + "\t" + getPermissions(item, true) + "\t" +item.getName());
            }
        }
    }
    public void isHumanReadable(boolean reverse) {
        for (File item : dir.listFiles()) {
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
