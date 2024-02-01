import java.util.Scanner;


public class Project_11 {
//Given an integer,N, perform the following conditional actions:
//If  is odd, print Weird
//If  is even and in the inclusive range of 2 to 5, print Not Weird
//If  is even and in the inclusive range of 6 to 20 , print Weird
//If  is even and greater than 20 , print Not Weird


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            if (2 <= N && N <= 5) {
                System.out.println("Not Weird");
            }
            if (6 <= N && N <= 20) {
                System.out.println("Weird");
            }

            if (20 < N) {
                System.out.println("Not Weird");

            }

        }
        else {
            System.out.println("Weird");





}}}