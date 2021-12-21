import java.util.*;
class OperatorOVERDDN
{
 void operator(String str1,String str2)
{
String s=str1+str2;
System.out.println("concatinated string = " +s);
}

void operator(int a, int b)
{
int c=a+b;
System.out.println("sum = " +c);
}
}
class Main13
{
public static void main(String args[])
{
OperatorOVERDDN obj = new OperatorOVERDDN();
obj.operator(2,3);
obj.operator("Priyank ", " Sharma");
}
}