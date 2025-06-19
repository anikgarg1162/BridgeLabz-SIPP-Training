import java.util.*;
public class WindChill{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature (in Fahrenheit) : ");
		double temp=sc.nextDouble();
		System.out.print("Enter wind speed (in mph) : ");
		double speed=sc.nextDouble();
		double chill = calculateWindChill(temp, speed);
		System.out.println("wind chill : " + chill );
	}

	public static double calculateWindChill(double temp, double speed){
		double wind=  ( 35.74 ) + ( 0.6215 * temp ) + ( ( ( 0.4275 * temp ) - 35.75 ) * ( Math.pow(speed,0.16) ) );
		return wind;
	}
}

