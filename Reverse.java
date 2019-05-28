class Reverse
{
public static void main(String args[])
{
int a=863,b=0;
b=b+a%10;
b=b*10;
a=a/10;
b=b+a%10;
b=b*10;
a=a/10;
b=b+a%10;
a=a/10;
System.out.println(a);
System.out.println(b);
}
}