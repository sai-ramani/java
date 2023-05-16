/* add cubes of odd elements and squares of even elements of the array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		int res = user.method(a,n);
		System.out.println(res);
	}
}
class user{
    public static int method(int[] a,int n){
        int ans = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2 == 0){
                ans += a[i]*a[i];
            }
            else{
                ans += a[i]*a[i]*a[i];
            }
        }
        return ans;
    }
}
