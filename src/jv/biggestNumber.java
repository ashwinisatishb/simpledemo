package jv;
import java.util.Scanner;

public class biggestNumber {
	public static void main(String[] args)
	{
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the value of A");
		    int big=sc.nextInt();
		    System.out.println("enter the value of B");
		    int small=sc.nextInt();
		    if(big>small)
			System.out.println("A is biggest number "+big);
		    else
		    System.out.println("B is biggest number "+small);
	}

}
