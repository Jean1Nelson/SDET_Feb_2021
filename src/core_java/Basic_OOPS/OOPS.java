package core_java.Basic_OOPS;

public class OOPS {

    //constructor
    /*
     * Product() { System.out.println("--Product object is getting created------");
     * }
     */
    
    //attributes or properties --INSTANCE VARIABLES
    private int pid;
    private int price;
    private String name;
    
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPrice() //return type is int
    {
        return price;//last statement in any method
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
