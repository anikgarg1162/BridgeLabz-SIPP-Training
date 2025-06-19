import java.util.*;
public class PowerCalculation{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base value : ");
		double base=sc.nextDouble();
		System.out.print("\nEnter Exponent Value : ");
		double exponent=sc.nextDouble();
		double power=Math.pow(base,exponent);
		System.out.print("\nPower is : " + power);
}
}