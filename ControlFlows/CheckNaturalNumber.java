import java.util.*;
public class CheckNaturalNumber{
	 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	 	int n=sc.nextInt();
		int sum=0;
		if(n>0){
	 	   for(int i=1;i<=n;i++){
			sum=sum + i;
		    }
			System.out.print("The sum of " + n+ " natural numbers is " + sum);
		}
		else{
		    System.out.print("The number "+ n+ " is not a natural number ");
		}
}
}