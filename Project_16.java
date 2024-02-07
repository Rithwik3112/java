public class Project_16 {
    //Method over loadings
    static void foo(int a){
        System.out.println("i love you "+a);
    }
    static void foo(int a,int b ){
        System.out.println("i love you "+a+b);
    }
    static void foo(){
        System.out.println("i love you ");
    }

    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(1500,1500);
    }
}
