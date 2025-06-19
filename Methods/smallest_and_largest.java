import java.util.*;
public class smallest_and_largest{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers for checking : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int [] result={num1,num2,num3};
		int [] ans=solve(result);
		System.out.println("smallest number is : " + ans[0]);
		System.out.println("largest number is : " + ans[2]);
	}
	
	public static int [] solve(int [] result){
		Arrays.sort(result);
		return result;
	}
}
		