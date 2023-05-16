/* find sum of common elements in the arrays */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i=0;i<n;i++){
		    arr1[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++){
		    arr2[i] = sc.nextInt();
		}
		int res = user.method(arr1,arr2,n,m);
		if(res == 0){
		System.out.println("No common element");
		}
		else{
		    System.out.println(res);
		}
	}
}
class user{
    public static int method(int[] arr1,int[] arr2,int n,int m){
        int s = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i] == arr2[j]){
                    s += arr1[i];
                }
            }
        }
        return s;
    }
}
