import java.util.*;
public class TrignoFunction{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter angle : ");
		double angle=sc.nextDouble();
		double [] result=solve(angle);
		
		System.out.println("sin ("+ angle + ") = "+ result[0]);
		System.out.println("cos ("+ angle + ") = "+ result[1]);
		System.out.println("tan ("+ angle + ") = "+ result[2]);
	
	}
	
	public static double[] solve(double angle){
		double radian=Math.toRadians(angle);

		double Sin=Math.sin(radian);
		double Cos=Math.cos(radian);
		double Tan=Math.tan(radian);
		
		return new double[]{Sin,Cos,Tan};
	}
}