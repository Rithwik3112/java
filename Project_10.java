import java.util.Scanner;
public class Project_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        switch(age){
         case 18:
             System.out.println("you are going to become an adult ");
             break;
            case 60:
            System.out.println("going to retired ");
            break;
        default:
        System.out.println("enjoy your life ");


}
    }

}
