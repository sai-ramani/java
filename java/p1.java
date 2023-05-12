/******************************************************************************

to check a sum of odd digits of a number is even or odd
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		while(n > 0){
		    int rem = n%10;
		    if(rem%2 != 0){
		        s += rem;
		    }
		    n = n/10;
		}
		if(s%2 == 0){
		    System.out.println("Sum of odd digits is even");
		}
		else{
		    System.out.println("Sum of odd digits is odd");
		}
	}
}
