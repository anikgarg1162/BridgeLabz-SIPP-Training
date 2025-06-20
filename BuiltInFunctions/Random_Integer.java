import java.util.*;
public class Random_Integer{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int random=(int)(Math.random()*100)+1;

		if(n==random){
			System.out.println("you Guess corrected");
		}
		else if(n < random ){
			System.out.println("you guess very low, guess higher number");
		}
		else{
			System.out.println("you guess very high, guess lower number");
		}
		System.out.print(random);
	}
} 		