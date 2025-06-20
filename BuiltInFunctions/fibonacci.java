import java.util.*;
public class fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		solve(n);
	}

	public static void solve(int n){
		int a=0;
		int b=1;
		while(a < n){
			System.out.print( a +" " );
			int next= a + b;
			a = b;
			b = next;
		}
	}
} 
