import java.util.*;
public class checkNumber{
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 if(num< 0){
	      System.out.print("number is negative");
	   }
	 else if(num>0){
	      System.out.print("number is positive");
	   }
	 else{
	     System.out.print("number is zero");
	   }
}
}