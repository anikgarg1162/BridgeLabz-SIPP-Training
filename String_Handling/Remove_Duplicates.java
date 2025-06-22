import java.util.*;
public class Remove_Duplicates{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Set<Character> seen= new LinkedHashSet<>();
		for(char ch : str.toCharArray()){
			seen.add(ch);
		}

		StringBuilder sb=new StringBuilder();
		for(char ch : seen ){
			sb.append(ch);
		}

		System.out.println("New String -> " + sb.toString() );
	}
}