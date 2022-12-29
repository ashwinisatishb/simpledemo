package jv;

public class swap {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("befor printing "+a);
		System.out.println("befour printing "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap printing  "+a);
		System.out.println("after swap printing  "+b);
	}

}
