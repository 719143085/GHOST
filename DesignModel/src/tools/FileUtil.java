package tools;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileUtil {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\LB\\pbomTemp\\LB00001-pbom_bak.xml");
        getModifiedTime1(file);
        getModifiedTime2(file);
    }
    /**
     * 读取文件修改时间的方法1
     */
    @SuppressWarnings("deprecation")
    public static void getModifiedTime1(File file){
        Calendar cal = Calendar.getInstance();
        long time = file.lastModified();
        cal.setTimeInMillis(time);
        //此处toLocalString()方法是不推荐的，但是仍可输出
        System.out.println("修改时间[1] " + cal.getTime().toLocaleString());
        //输出：修改时间[1]    2009-8-17 10:32:38
    }

    /**
     * 读取修改时间的方法2
     */
    public static void getModifiedTime2(File file){
        Calendar cal = Calendar.getInstance();
        long time = file.lastModified();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        cal.setTimeInMillis(time);
        System.out.println("修改时间[2] " + formatter.format(cal.getTime()));
        //输出：修改时间[2]    2009-08-17 10:32:38
    }
}
