package jv;
import java.util.Scanner;

public class VowelsEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		String rv=convertCap(st);
		System.out.println(" "+rv);
		
	}

      static String convertCap(String str) {
    	  String Vl="AEIOUaeiou";
    	  char ch[]=str.toCharArray();
    	  for(int i=0; i<ch.length; i++)
    		  if(ch[i]>='a'||ch[i]<='z')
    		  {
    			  if(Vl.indexOf(ch[i])!=-1)
    				  ch[i]=(char)(ch[i]-32);
    		  }
    		  else if(ch[i]>='A'&& ch[i]<'Z')
    		  {
    			  if(Vl.indexOf(ch[i])==-1)
    				  ch[i]=(char)(ch[i]+32);
    		  }
      String rev=new String(ch);
    	  
		return rev;
	}

}
