import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("enter the first number");
        int numberOne = In.readInt();
        Out.println("enter the second number");
        int numberTwo = In.readInt();
        Out.println("enter the third number");
        int numberThree = In.readInt();

        Out.println("");

        if (numberOne > numberTwo && numberOne > numberThree) {
            Out.println(numberOne);
        } else {
        if (numberTwo > numberOne && numberTwo > numberThree) {
            Out.println(numberTwo);
        }
        if (numberThree > numberOne && numberThree > numberTwo ) {
            Out.println(numberThree);
        }
        }
        if (numberOne == numberTwo && numberOne > numberThree && numberTwo > numberThree) {
            Out.println(numberOne);
            Out.println(numberTwo);
        }
        if (numberTwo == numberThree && numberTwo > numberOne && numberThree > numberOne) {
            Out.println(numberTwo);
            Out.println(numberThree);
        }
        if (numberOne == numberThree && numberOne > numberTwo && numberThree > numberTwo) {
            Out.println(numberOne);
            Out.println(numberThree);
        }
    }
}
