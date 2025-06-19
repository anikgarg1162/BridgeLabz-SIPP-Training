import java.util.*;
public class Check_Number{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int result=solve(num);
		System.out.println("Number is negative if ans is -1 " + 
				   "\nNumber is positive if ans is  1 " +
				   "\nNumber is zero if ans is 0 " );
		System.out.println("answer is "+ result );	
	}

	public static int solve(int num){
		if(num < 0){
			return -1;
		}
		else if(num > 0){
			return 1;
		}
		else{
			return 0;
		} 
	}
}
