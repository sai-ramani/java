/******************************************************************************

input string of even length
fetch two middle most characters from the input string 
class UserMainCode with static method getMiddleChars

string classes in java.lang package
string class has mutable classes
string buffer are mutable
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	    String res = UserMainCode.getMiddleChars(s);
	    System.out.println(res);
	}
}
class UserMainCode{
    public static String getMiddleChars(String s){
        StringBuffer sb = new StringBuffer();
        if(s.length()%2 == 0){
            sb.append(s.substring((s.length()/2)-1,(s.length()/2)+1));
        }
        return sb.toString();
    }
}
