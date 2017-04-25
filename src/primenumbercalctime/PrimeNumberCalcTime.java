package primenumbercalctime;

import java.util.Scanner;

/**
 *
 * @author jcd4912
 */
public class PrimeNumberCalcTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("To what number would you like to print out Prime Numbers?");
        int n = in.nextInt();
        for (int i = 2; i <= n; i++)
            if(prime(i)) 
                System.out.println(i);
            
    }
    public static boolean prime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) 
            if (num % i == 0)
                return false;
        return true;
    }
    
}
