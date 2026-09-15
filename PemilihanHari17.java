import java.util.Scanner;

public class PemilihanHari17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String dayName, dayType;

        System.out.print("Input day name: ");
        dayName = scanner.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "Invalid day name";
        }
        
        System.out.println(dayName + " is a " + dayType);
   
        scanner.close();
    }

}