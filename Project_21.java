class sad{
    private int id;
    private String name;
    public void setname(String n){
        this.name = n;
    }
    public String getname() {
        return name;
    }
    public void setId(int n){
         this.id= n ;
    }

    public int getId() {
        return id;
    }
}
public class Project_21 {
    public static void main(String[] args) {
      sad rithwik = new sad();
      rithwik.setname("rithwik reddy");
      rithwik.setId(44556);
        System.out.println(rithwik.getId());
        System.out.println(rithwik.getname());




    }

}
