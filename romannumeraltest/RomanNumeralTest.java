import java.util.ArrayList;
import java.util.List;

public class RomanNumeralTest {
    public static void main(String args[]){
        RomanNumeralTest test = new RomanNumeralTest();
        test.run();
    }
    private void run(){
        test(1, "I");
        test(2, "II");
        test(3, "III");
        test(4, "IV");
        test(5, "V");
        test(953, "CMLIII");
    }


    public void test(int number, String expected){
        String actual = translate(number);
        if(actual.equals(expected)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test failed!");
        }
    }



    List<RomanNumeral> romanNumerals = new ArrayList<RomanNumeral>();

    public void makeNumeralList(){
        romanNumerals.add(new RomanNumeral(1000, "M"));
        romanNumerals.add(new RomanNumeral(900, "CM"));
        romanNumerals.add(new RomanNumeral(500, "D"));
        romanNumerals.add(new RomanNumeral(400, "CD"));
        romanNumerals.add(new RomanNumeral(100, "C"));
        romanNumerals.add(new RomanNumeral(90, "XC"));
        romanNumerals.add(new RomanNumeral(50, "L"));
        romanNumerals.add(new RomanNumeral(40, "XL"));
        romanNumerals.add(new RomanNumeral(10, "X"));
        romanNumerals.add(new RomanNumeral(9, "IX"));
        romanNumerals.add(new RomanNumeral(5, "V"));
        romanNumerals.add(new RomanNumeral(4, "IV"));
        romanNumerals.add(new RomanNumeral(1, "I"));
    }

    public String translate(int number){
        makeNumeralList();
        int integer = number;
        String romanNumeralString = "";
        while(integer > 0){
            for(RomanNumeral romanNumeral : romanNumerals){
                if(integer >= romanNumeral.getValue()){
                    romanNumeralString += romanNumeral.getNumeral();
                    integer -= romanNumeral.getValue();
                }
            }
        }
        return romanNumeralString;
    }
}