import java.util.*;

public class PK {
    private Computer computer;
    
    public PK(){
        this.computer = new computer();
    }
    
    public String getprocessor() {
        return computer.getprocessor();
    }
    
    public String getOZY() {
        return computer.getOZY();
    }
    
    public String getdisk() {
        return computer.getdisk();
    }
    
    public String getvideokarta() {
        return computer.getvideokarta();
    }
}
