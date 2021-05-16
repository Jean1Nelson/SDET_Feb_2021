package lab2;

public class Ex1 {
    
    public static int classVariable;
    private int instanceVariable;
    
    public int getInstanceVariable() {
        return instanceVariable;
    }
    public void setInstanceVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }
    
    public void printVariableValues() {
        int localVariable = 10;
        
        System.out.println("Local Variable: "+localVariable);
        System.out.println("Class Variable: "+classVariable);
        System.out.println("InstanceVariable "+instanceVariable);
    }

}
