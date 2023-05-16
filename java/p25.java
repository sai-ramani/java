/* calculating ncr */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int res = user.ncr(n,r);
		System.out.println(res);
	}
}
class user{
    public static int ncr(int n,int r){
        int nf = 1,rf = 1,n_rf = 1;
        for(int i=1;i<=n;i++){
            nf *= i;
        }
        for(int i=1;i<=r;i++){
            rf *= i;
        }
        for(int i=1;i<=n-r;i++){
            n_rf *= i;
        }
        return (nf)/(rf*n_rf);
    }
}
