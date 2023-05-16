/* password validation
lehgth > 8
contain any @,#,_
should not start with number or special Character
should not end with special character*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int res = user.valid(s);
		if(res == 1){
		    System.out.println("valid");
		}
		else
		System.out.println("invalid");
	}
}
class user{
    public static int valid(String s){
        if(s.length() < 8)
        return 0;
        if(s.matches("[a-zA-Z]{1}.*[@#_]{1}.*[a-z0-9A-Z]{1}")){
            return 1;
        }
        return 0;
    }
}
