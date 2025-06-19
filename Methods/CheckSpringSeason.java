import java.util.*;
public class CheckSpringSeason {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter month (eg. 3) : ");
        	int month =sc.nextInt(); 
		System.out.print("Enter date (eg. 20) : ");
        	int day = sc.nextInt();
		System.out.println("Entered Date is Spring : " + spring(month , day) ); 

	}


	public static boolean spring(int month, int day){
		boolean isSpring = false;

        	if ((month == 3 && day >= 20 && day <= 31) ||
        	     (month == 4 && day >= 1 && day <= 30) ||
                     (month == 5 && day >= 1 && day <= 31) ||
                    (month == 6 && day >= 1 && day <= 20)) {
                      isSpring = true;
                 }

        	if (isSpring) {
            		return true;
        	} else {
            		return false;
        	}
	}
}