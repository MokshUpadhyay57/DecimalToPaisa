// Convert rupess entered in decimal into paisa(75.95 = 7595).
// Author - Moksh Upadhyay
// Date - 04/03/2021

import java.util.Scanner;
public class DecimalToPaisa {
    public static void main(String[] args) {
        double d;
        int paisa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Rupees: ");
        d = sc.nextFloat();
        sc.close();
        paisa = (int)(d*100);
        System.out.print("Rupees in paisa: " + paisa);
    }
}
