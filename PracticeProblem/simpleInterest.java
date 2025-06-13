import java.util.*;
public class simpleInterest{
     public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
     double principle =sc.nextDouble();
     double rate= sc.nextDouble();
     double year=sc.nextDouble();
     double interest=( principle * rate * year ) /100;
     System.out.println(interest);
     }
}

