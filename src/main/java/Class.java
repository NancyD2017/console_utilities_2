import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Class {
    static List<String> items = new ArrayList();
    public static void main(String[] args) {
        File dirPath = new File(args[0]);
        boolean isThereOutput = false;
        for (int i = 1; i < args.length; i++) {
            String flag = args[i];
            switch (flag) {
                case "[-l]":
                    boolean isReverse = false;
                    if (i < args.length - 1) if (args[i+1].equals("[-r]")) isReverse = true;
                    isItLong(isReverse, dirPath);
                    break;
                case "[-h]":
                    boolean isReversed = false;
                    if (i < args.length - 1) if (args[i+1].equals("[-r]")) isReversed = true;
                    isHumanReadable(isReversed,dirPath);
                    break;
                case "[-r]":
                    break;
                case "[-o]":
                    isThereOutput = true;
                    try(FileWriter writer = new FileWriter(args[i+1]))
                    {
                        for (String it: items) {
                            writer.write(it + "\n");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    i++;
                    break;
            }
        }
        if (!isThereOutput) System.out.println(items);
    }
    public static File[] isDirectory(File dirPath) {
        if (!dirPath.isDirectory()) return new File[]{dirPath};
        else return dirPath.listFiles();
    }
    public static void isItLong(boolean reverse, File dirPath) {
        for (File item : isDirectory(dirPath)) {
            Date date = new Date(item.lastModified());
            if (!reverse) {items.add(item.getName() + "\t" + getPermissions(item, true) + "\t" + date + "\t" + item.length() + " bytes");} else {
                items.add(item.length() + " bytes" + "\t" + date + "\t" + getPermissions(item, true) + "\t" +item.getName());
            }
        }
    }
    public static void isHumanReadable(boolean reverse, File dirPath) {
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
    public static StringBuilder getPermissions(File item, boolean isLongOrHR) {
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