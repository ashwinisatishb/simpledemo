package jv;
import java.util.Scanner;

public class SimpleVowelEx {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		String sl=VowelEx(str);
		System.out.println(""+sl);
		
	}

	static String VowelEx(String str) 
	{
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&& ch[i]<='z')
				if(ch[i]=='a'||ch[i]=='i'||ch[i]=='e'||ch[i]=='o'||ch[i]=='u')	{
				ch[i]=(char)(ch[i]-32);
			     count++;
                 
		    }
		}
		System.out.println(""+count);
	    String rev=new String(ch);
		return rev;
	}

}
