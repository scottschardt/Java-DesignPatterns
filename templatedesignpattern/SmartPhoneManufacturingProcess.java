public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartPhoneManufacturingProcess(String name){
        super(name);
    }


    protected void assembleDevice(){
        System.out.println("assembled smartphone");
    }
    protected void testDevice(){
        System.out.println("tested smartphone");
    }
    protected void packageDevice(){
        System.out.println("packaged smartphone");
    }
    protected void storeDevice(){
        System.out.println("stored smartphone");
    }

}