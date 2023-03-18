package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        System.out.println(inch * 2.54);

    }
}
