/* validating ip address */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int res = user.method(s);
		if(res == 0){
		    System.out.println("invalid");
		} 
		else
		    System.out.println("valid");

	}
}
class user{
    public static int method(String s){
        StringTokenizer t = new StringTokenizer(s,".");
        int a = Integer.parseInt(t.nextToken());
        int b = Integer.parseInt(t.nextToken());
        int c = Integer.parseInt(t.nextToken());
        int d = Integer.parseInt(t.nextToken());
        
        if(a >= 0 && a <= 255 && b >= 0 && b <= 255 && c >= 0 && c <= 255 && d >= 0 && d <= 255)
        return 1;
        return 0;
    }
}
