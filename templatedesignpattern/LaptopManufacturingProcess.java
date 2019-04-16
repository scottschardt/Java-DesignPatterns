

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String name){
        super(name);
    }
    protected void assembleDevice(){
        System.out.println("assembled laptop");
    }
    protected void testDevice(){
        System.out.println("tested laptop");
    }
    protected void packageDevice(){
        System.out.println("packaged laptop");
    }
    protected void storeDevice(){
        System.out.println("stored laptop");
    }
}