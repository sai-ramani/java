/******************************************************************************

string input
n as input
construct a strign with first n characters and last n characters
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		String ans = a.method(s,n);
		System.out.println(ans);
	}
}
class a{
    public static String method(String s,int n){
        String ans = new String();
        ans = s.substring(0,n) + s.substring(s.length()-n,s.length());
        return ans;
    }
}

