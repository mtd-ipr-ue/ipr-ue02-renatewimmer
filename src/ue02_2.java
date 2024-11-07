import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Enter a year: ");
        int year = In.readInt();
        Out.println("Enter a month: ");
        int month = In.readInt();
    
        int days = 0;
        
        if (year <0 || month <0) {
            Out.println("Error, no negative digitis for years or months allowed.");
            year = In.readInt();
            month = In.readInt();
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
        
            case 4, 6, 9, 11:
                days = 30;
                break;
            
            case 2:
                if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0) {
                    days = 29;
                } else{
                    days = 28;
                }
        }
        Out.println("The amount of days within this month is: ");
        Out.print(days);
    }
}
