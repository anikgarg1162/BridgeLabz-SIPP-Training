import java.util.*;
public class Maximum_Of_Three{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
 		int max=solve(a,b,c);
		System.out.println("Maximum of these numbers is : "+ max);
	}

	public static int solve(int a,int b,int c){
		int max=Math.max( Math.max(a,b) , c );
		return max;
	}
}