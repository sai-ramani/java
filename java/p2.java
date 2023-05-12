/******************************************************************************

check whether the given number is valid or not xxx-xxx-xxxx
contain Valid number class to check

the matches method is present in pattern class in util package
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int r = UserMainCode.validateNumber(number);
		if(r == 1){
		    System.out.println("Valid");
		}
		else{
		    System.out.println("invalid");
		}
		sc.close();
	}
}

class UserMainCode{
    public static int validateNumber(String number){
        if(number.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
        return 1;
        else
        return 0;
    }
}
