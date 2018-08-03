package ext.javaDev.util;

public class StringUtil {
    public static String getPreObject(String str) {
        String prevVer;
        String prevS;
        if (str.indexOf(".") > 0) {
            prevVer = str.substring(str.indexOf(".") + 1, str.length());
            if ("A".equals(prevVer)) {
                return str;
            }
            char nowC = prevVer.charAt(0);
            int nowI = (int) nowC;
            nowI = nowI - 1;
            char prevC = (char) nowI;
            prevS = String.valueOf(prevC);
            prevS = str.substring(0, str.indexOf(".") + 1) + prevS;
            return prevS;
        } else {
            prevVer = str;
            if ("A".equals(prevVer)) {
                return str;
            }
            char nowC = prevVer.charAt(0);
            int nowI = (int) nowC;
            nowI = nowI - 1;
            char prevC = (char) nowI;
            return String.valueOf(prevC);
        }
    }

    public static void main(String[] args) {
        String number = " ";
        System.out.println(number.isEmpty());
    }

}
