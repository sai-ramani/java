/******************************************************************************

to calculate sum of squares of even digits 
class UserMainCode with static method sumOfSquaresOfEvendigits 

static block will evaluated and static methods are evaluated
default package in java is lang
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = UserMainCode.sumOfSquaresOfEvendigits(n);
		System.out.println(res);
	}
}
class UserMainCode{
    public static int sumOfSquaresOfEvendigits(int num){
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            if(rem%2 == 0){
                ans += rem*rem;
            }
            num = num/10;
        }
        return ans;
    }
}
