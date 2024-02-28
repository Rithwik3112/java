class base1 {
    int x ;
    base1(){
        System.out.println("hi");

    }
    base1(int x ){
        System.out.println("fndshfbsjhd   "+x);


    }

public int getx(){
    return x ;

}
public  void setx(int x ){
    this.x=x;

    }


        }
class derived1 extends base1 {
    int y;
    derived1(){
        System.out.println("bye");

    }
    derived1(int x , int y){
        super(x);
        System.out.println("jkfbashbfhsbhd   "+y);
    }

    public int gety(){
        return y ;

    }
    public  void sety(int y ){
        this.y=y;

    }


}


public class Project_26 {
    public static void main(String[] args) {
        derived1 d = new derived1(34,54);



    }


}
