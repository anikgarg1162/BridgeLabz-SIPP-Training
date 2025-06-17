import java.util.*;
public class MeanHeight{
	public static void main(String[] args){
          double[] arr=new double[11];
	  System.out.println("Enter heights of players");
	  Scanner sc=new Scanner(System.in); 
	  for(int i=0;i<11;i++){
		arr[i]=sc.nextInt();
		}
	  double sum=0;
	  for(int i=0;i<11;i++){
		sum=sum+arr[i];
	  }
	  System.out.println("average of heights of players is "+sum/11);
}
}
				