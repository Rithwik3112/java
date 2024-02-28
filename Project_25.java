import java.util.Scanner;

public class Project_25 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());
        if(A.length()<B.length()) {
            System.out.println("No");
        }
        if(A.length() == B.length()){
                System.out.println("No");
            }
        else{
                System.out.println("yes");
            }
            System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " "+  B.substring(0,1).toUpperCase() + B.substring(1));



        }
    }


