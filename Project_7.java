import java.util.Scanner;
public class Project_7 {
    public static void main(String args[]){
        String a="Rithwik";
        String a1 =a.toLowerCase();
        String a2 =a.toUpperCase();
        System.out.println(a2);
        System.out.println(a1);
        String b="      Rithwik Reddy     ";
        String b1=b.trim();
        System.out.println(b1);
        String a4 = a.substring(2,5);
        System.out.println(a4);
        String b2="harry";
        String a5 =b2.replace('r','p');
        System.out.println(a5);
        System.out.println(a2.charAt(2));
        System.out.println(a.indexOf("i",3));
        System.out.println(a.lastIndexOf("i",3));
        System.out.println(a.equals("Rithwik"));


            }
}
