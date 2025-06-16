import java.util.*;
public class fee_discount{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  int fee= sc.nextInt();
	  int discount_Percent= sc.nextInt();
	  int discount_amount=(fee *discount_Percent)/100;
	  int Final_amount= fee-discount_amount;
	  System.out.print("The discount amount is INR "+ discount_amount+" and final discounted fee is INR "+ Final_amount);
}
} 