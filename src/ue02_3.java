import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Enter x-coordiante");
        double x = In.readDouble();
        Out.println("Enter the y-coordiante");
        double y = In.readDouble();

        double r = (Math.sqrt(x * x) + (y * y));

        boolean greenSpace = (0 <= x) && (x <= 4) && (0 <= y) && (y <= 4);
        boolean outsideCircle = r > 4;
            

            if (greenSpace && outsideCircle) {
                System.out.println("The Point is within the green space");
           } else{
                System.out.println("The Point is not within the green space");     
            } 
    }
}
