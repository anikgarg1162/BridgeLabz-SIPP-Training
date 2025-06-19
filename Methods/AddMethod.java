import java.util.*;
public class AddMethod{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter natural number : "); 
		int n=sc.nextInt();
		int sum=solve(n);
		System.out.print("\nsum of " + n + " natural numbers : "+sum);
	}
	
	public static int solve(int n){
		int total=0;
		for(int i=1;i<=n;i++){
			total += i;
		}
		return total;
	}
}