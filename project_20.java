class myclass{
    int salary;
    String name ;
        public int getsalary(){
            return salary;

        }
        public String namestudent(){
            return name;

        }
        public void setname(String n){
            name=n;


        }





}
public class project_20 {
    public static void main(String[] args) {
        myclass rithwik = new myclass();
        rithwik.setname("rithwik reddy");
        rithwik.salary=200;

        System.out.println(rithwik.namestudent());

        System.out.println(rithwik.getsalary());


    }



}
