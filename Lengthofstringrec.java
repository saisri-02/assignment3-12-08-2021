import java.util.*;
class Lengthofstringrec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println("Length of string : "+Length(s));
}
static int Length(String s)
{
if(s.equals(""))
return 0;
else
return (Length(s.substring(1))+1);
}
}

output:

hello
Length of string : 5