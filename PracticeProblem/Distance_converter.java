import java.util.*;
public class Distance_converter{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter distance in kilometer : ");
		double dis=sc.nextDouble();
		double miles= dis * 0.621371;
		System.out.print("distance in miles is : "+ miles);
}
} 