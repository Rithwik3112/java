class cry{
    public void greet(){
        System.out.println("this is morning my boy ");
    }
    public void meth(){
        System.out.println("hello my dear");
    }


}
class more_cry extends cry{
    public void meth(){
        System.out.println("namasthe ");

    }
    public void meth2(){
        System.out.println("bro hello ");

    }
   


}
public class Project_28 {
    public static void main(String[] args) {
       cry obj = new more_cry();
      // cry objd = new cry();
        obj.meth(); 
       // objd.meth();







    }


}
