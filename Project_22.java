class happy{
    private int id;
    private String name ;
    public happy(String myname , int iD) {

        this.id = iD;
        this.name = myname;
    }
    public int getId() {
        return id;
    }
    public String getName() {

        return name;
    }
}
public class Project_22 {
    public static void main(String[] args) {
        happy rithwik= new happy("rithwik",3234);


        System.out.println(rithwik.getId());
        System.out.println(rithwik.getName());
    }

    }


