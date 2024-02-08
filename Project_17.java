public class Project_17 {
        static int sum(int ...arr){
            int result=0;
            for(int a:arr){
                result += a;
            }
            return result;

        }
        static int Factorial(int a){
            int n=1;
            int product=1;

            while (n<=a){
                 product *= n;
                    n++;
                
            }
            System.out.println(product);
            return product;
            
            
        }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        //recursion
        int e= 6;
        Factorial(e);

    }

}
