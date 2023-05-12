/******************************************************************************

merge two array lists and return the 2,6,8 position elements of the new array list
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> arr1 = new ArrayList<Integer>();
	    ArrayList<Integer> arr2 = new ArrayList<Integer>();
	    ArrayList<Integer> ans = new ArrayList<Integer>();

	    System.out.println("enter length of first array");
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        arr1.add(sc.nextInt());
	    }
	    
	    System.out.println("enter length of second array");
	    n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        arr2.add(sc.nextInt());
	    }
	    
	    ans = a.method(arr1,arr2);
	    System.out.println(ans);

	}
}
class a{
    public static ArrayList<Integer> method(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        arr1.addAll(arr2);
        Collections.sort(arr1);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(arr1.get(2));
        ans.add(arr1.get(6));
        ans.add(arr1.get(7));
        
        return ans;

    }
}
