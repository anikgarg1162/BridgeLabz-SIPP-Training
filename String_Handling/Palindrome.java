import java.util.*;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		str = str.replaceAll(" ", "");

		int front=0;
		int last=str.length()-1;
		while(front < last){
			if(str.charAt(front) == str.charAt(last)){
				front++;
				last--;
			}
			else{
				System.out.println("String is not Palindrome " );
				return;
			}
		}
		System.out.println("String is Palindrome -> " + str );
	}
}