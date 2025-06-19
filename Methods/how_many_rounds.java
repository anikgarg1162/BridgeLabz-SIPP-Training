import java.util.*;
public class how_many_rounds{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sides of park in meter : ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double ans=solve(num1,num2,num3);
		System.out.println("number of rounds to complete 5km is : " + ans);
	}
	
	public static double solve(double num1,double num2,double num3){
		double perimeter=num1+num2+num3;
		double rounds= 5000/perimeter;
		return rounds; 
	}
}
		