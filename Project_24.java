class rhino{
     int x ;

    public void setx( int x ){
        this.x=x;

    }
    public int getx(){
        return x;

    }
    public  rhino (){
        System.out.println("i am a constructor ");
    }

}
class derived extends rhino{
    int y;


    public void sety( int y){
        this.y=y;

    }
    public int gety(){
        return x;

    }

}
public class Project_24 {
    public static void main(String[] args) {
        rhino sorry=new rhino();
        sorry.setx(23123);
        sorry.getx();
        System.out.println(sorry.getx());
        derived woaky = new derived();
        woaky.sety(23);
        System.out.println(woaky.gety());





    }



}
