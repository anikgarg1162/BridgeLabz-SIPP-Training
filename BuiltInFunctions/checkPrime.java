import java.util.*;
public class checkPrime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		boolean isPrime = solve(n);
		if(isPrime){
			System.out.println("number is Prime");
		}
		else{
			System.out.println("number is not Prime");
		}
	}

	public static boolean solve(int n){
		if( n <= 1 ){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if( n % i == 0){
				return false;
			}
		}
		return true;
	}
}