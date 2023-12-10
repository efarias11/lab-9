import java.util.Scanner;
public class multi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a value to be converted from (pounds/miles/gallons) to (kg/km/liters): ");
        double num = kb.nextDouble();
        kb.nextLine();

        System.out.print("What do you want to convert from? (p/m/g): ");
        char conv = kb.next().charAt(0);

        if (conv == 'p'){
            double value = kilo(num);
            System.out.println("You converted "+num+" lbs to "+value+" kilograms!");
        }
        else if (conv=='m'){
            double value = miles(num);
            System.out.println("You converted "+num+" miles to "+value+" kilometers!");
        }
        else if (conv=='g'){
            double value = liters(num);
            System.out.println("You converted "+num+" gallons to "+value+" liters!");
        }
    }
    public static double kilo(double p){
        double kg = p/2.2;
        return kg;
   }
    public static double miles(double m){
        double km = m*1.61;
        return km;
   }
    public static double liters(double g){
        double l = g*3.79;
        return l;
   }
}
