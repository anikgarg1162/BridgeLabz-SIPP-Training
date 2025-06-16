import java.util.*;
public class remaining_pen{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  int pens= sc.nextInt();
	  int student= sc.nextInt();
	  int pen_div=pens/student;
	  int remaining= pens % pen_div;
	  System.out.print("The Pen Per Student is "+pen_div+" and the remaining pen not distributed is "+ remaining);
}
} 