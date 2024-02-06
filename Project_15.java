public class Project_15 {
     int logic(int x,int y){
       int z=x+y;
       return z;
    }

    int car(int x,int y) {
        int f = x * y;
        return f;

    }
    static void change (int []marks){
         marks[0]=98;
    }

    public static void main(String[] args) {

        Project_15 obj = new Project_15();

        int a = 2;
        int b = 4;
        int c = obj.car(a, b);
        System.out.println(c);

        int a1 = 2;
        int b1 = 4;
        int c1 = obj.logic(a1, b1);
        System.out.println(c1);

        // arrays
        int []marks={12,34,56,78,13};
        change(marks);
        System.out.println(marks[0]);



    }
}
