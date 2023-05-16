/* remove elements of the given length in the array and return the length of the final array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for(int i=0;i<n;i++){
		   a[i] = sc.next();
		}
		int m = sc.nextInt();
		int res = user.method(a,n,m);
		System.out.println(res);
	}
}
class user{
    public static int method(String[] s,int n,int m){
        int r = n;
        for(int i=0;i<n;i++){
            if(s[i].length() == m){
                r -= 1;
            }
        }
        return r;
    }
}
