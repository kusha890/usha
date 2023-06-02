
import java.util.*;
public class Program206
{
public static void main(String[]args)
{char ch;
System.out.println("Enter a Character :");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println("This is a alphabet");
else if(ch>='0'&&ch<='9')
System.out.println("This is a digit");
else
System.out.println("This a special character");
}
}


