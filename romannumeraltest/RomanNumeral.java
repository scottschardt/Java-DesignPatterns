public class RomanNumeral {
    int value; 
    String numeral;

    public RomanNumeral(int value, String numeral){
        this.value = value;
        this.numeral = numeral;
    }

    public int getValue(){
        return this.value;
    }
    public String getNumeral(){
        return this.numeral;
    }
}