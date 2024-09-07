// import stuff here
import java.lang.Math;
import java.util.Scanner;

//Your code here
public class program7
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        int klevins; 
        int schruteBuck;
        int stanleyNickels;
        int oldStanleyNickle = 0;
        int oldSchruteBuck = 0;
        int oldKlevin = 0;
        
        // 12 stanley-nickles = 1 klevin
        // 20 klevins = 1 schruteBuck 
        // new
        // 100 stanleyNickels = 1 schruteBuck

        //ask for data
        System.out.println("Enter old Stanley-Nickles:");
        oldStanleyNickle = myObj.nextInt();
        System.out.println("Enter old Klevins:");
        oldKlevin = myObj.nextInt();
        System.out.println("Enter old Schrute-Bucks:");
        oldSchruteBuck = myObj.nextInt();
        
        //math
        final double stanleyNickle = ((((oldKlevin * 12.0)+(9))*10/24)); // klevin*12+nickle
        final double newStanleyNickle = (stanleyNickle+oldSchruteBuck*100.0);
        final double finalValue = Math.round(newStanleyNickle);
        //output
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Decimal Schrute-Bucks = $" + (finalValue/100));  //convert to decimal then move decimal to places up
    }
}

// 20 klevins to a schrute-buck, and 12 stanley-nickels to a klevin.
// new only schrute-bucks and stanley-nickels, 
// with 100 stanley-nickels to a schrute-buck
//Paste console output below:
/*

Enter old Stanley-Nickles:
9
Enter old Klevins:
17
Enter old Schrute-Bucks:
7



Decimal Schrute-Bucks = $7.89

*/
