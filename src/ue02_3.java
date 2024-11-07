import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Enter x-coordiante");
        double x = In.readDouble();
        Out.println("Enter the y-coordiante");
        double y = In.readDouble();

        double centerX = 0;
        double radius = 4;
        double centerY = 0;

        if ((0 <= x) && (x <= 4) && (0 <= y) && (y <= 4)) {
            Out.println("the point is not within the green space");
        }
    }
}
