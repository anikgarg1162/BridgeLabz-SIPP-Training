import java.util.*;
public class quotient_and_reminder{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter number2 : ");
		int num2=sc.nextInt();
		int [] result=solve(num1,num2);
		System.out.println("quotient of numbers is : "+ result[0]);
		System.out.print("reminder of numbers is : "+ result[1]);
	}

	public static int[] solve(int num1, int num2){
		int quotient= num1/num2;
		int reminder=num1%num2;
		return new int[]{quotient,reminder};
	}
}
