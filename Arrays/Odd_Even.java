import java.util.*;
public class Odd_Even{
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int size=(n/2)+1;
	 int[]odd=new int[size];
	 int [] even=new int [size];
	 int odd_count=0;
	 int even_count=0;
	 if(n < 0){
	    return;
	 }
	 else{
	    for(int i=1;i<n+1;i++){
		if(i%2==0){
		   even[even_count]=i;
		   even_count++;
		}
		else{
		   odd[odd_count]=i;
		   odd_count++;
		}
	   }
	for(int i=0;i<even_count;i++){
		System.out.print(even[i]+ " " );
	 }
	System.out.println();
        for(int i=0;i<odd_count;i++){
		System.out.print(odd[i]+ " " );
	 }
	}
}
}