package test;
import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        String a = "123456";
        System.out.println(a.replace("2", "3")); //在字符串内查找到“2”，并将其替换为“3”
        System.out.println(Arrays.toString(a.split("3")));//将字符串以“3”分割，并将其转化为数组输出
        System.out.println(a.equals("123456"));//判断字符串是否相等
        System.out.println(a.matches("123*"));//利用正则表达式匹配
        char []s = a.toCharArray();//将string转化为char数组
        "321".getChars(0, 3, s, 3);//将字符串的部分替换
        System.out.println(String.valueOf(new char[]{'j','a','v','a'}));//可以使用char数组来转换成字符串
        System.out.println(String.format("%7.2f%6d%-4s", 45.556, 14, "AB"));//格式化输出
    }
}