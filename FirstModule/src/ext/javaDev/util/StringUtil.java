package ext.javaDev.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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

    /**
     * java获取键盘输入的几种方法
     */
    public static void getKeyboardInput(int i) {
        try {
            if (i == 1) {
                System.out.print("Enter a Char:");
                char c = (char) System.in.read();
                System.out.println("your char is :"+i);
            }else if(i == 2){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = null;
                System.out.println("Enter your value:");
                str = br.readLine();
                System.out.println("your value is :"+str);
            }else if(i ==3){
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你的姓名：");
                String name = sc.nextLine();
                System.out.println("请输入你的年龄：");
                int age = sc.nextInt();
                System.out.println("请输入你的工资：");
                float salary = sc.nextFloat();
                System.out.println("你的信息如下：");
                System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
