import java.util.*;
public class maximum_handshakes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students : "); 
		int n=sc.nextInt();
		int ans=solve(n);
		System.out.print("\nmaximum numbers of handshakes is : " + ans);
	}
	
	public static int solve(int n){
		int total= (n*(n-1))/2;
		return total;
	}
}