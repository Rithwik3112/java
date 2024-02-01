
//LOOPS
public class Project_12 {
        public static void main(String[] args) {
//WHILE Loop
                int i=1;
                while(i<=10){
                        System.out.println(i);
                        i++;
                }
//DO-WHILE Loop
                i=2;
                do{
                        System.out.println(i);
                        i++;
                }while(i<=10);
//For Loops
                int a=32;
                for(a=32; a<=50;a++){
                        System.out.println(a);
                }
//Breaking LOOPs
                i=1;
                while(i<=10){
                        System.out.println(i);
                        if(i==5){
                                System.out.println("breaking the loop");
                                break;

                        }
                        i++;
                }
//continuous LOOPs
                i=1;
                while(i<=10){
                        System.out.println(i);
                        i++;
                        if(i%2==0){
                                System.out.println("breaking the loop");

                                continue;

                        }






        }




}}
