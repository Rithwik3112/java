import java.util.Scanner;
public class Project_14 {
    //palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(A);
        int i = 0;
        int j = A.length() - 1;

        while (i < j) {
            i++;
            j--;
            if (A.charAt(i) != A.charAt(j)) {
                System.out.println("Not a palindrome");
                break;

            }
            else{
                System.out.println("Palindrome");
                break;

            }



        }


    }
}










