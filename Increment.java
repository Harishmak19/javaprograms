class Increment
{
public static void main(String args[])
{
int x=20;
int y=5;
x=x++ - ++y;
y=x++ + y++;
System.out.println(x);
System.out.println(y);
}
}