# Leap
import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter a year");
if((n%400==0)||(n%4==0))
{
System.out.println("It is a leapyear");
}
else
{
System.out.println("It is not a leapyear");
}
}
}
