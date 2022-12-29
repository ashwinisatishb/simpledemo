package jv;
import java.util.Scanner;

public class posOrNeg {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int x=sc.nextInt();
		if(x>0)
			System.out.println("positive");
		else
			System.out.println("negetive");
		
	}

}
