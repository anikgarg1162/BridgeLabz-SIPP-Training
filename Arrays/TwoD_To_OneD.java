import java.util.*;
public class TwoD_To_OneD{
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 int row=sc.nextInt();
	 int col=sc.nextInt();
	 int [][] arr=new int [row][col];
	 for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			arr[i][j]=sc.nextInt();
		}
	}
	int size=row*col;
	int count=0;
	int [] arr1=new int[size];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			arr1[count]=arr[i][j];
			count++;
		}
	}
	for(int i=0;i<size;i++){
	  System.out.print(arr1[i]+ " ");
	}
}
}