import java.util.*;
import java.io.*;
class sam1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the no of value");
int n=s.nextInt();
int a[]=new int[n];
int i=0,j=0;
while(i<a.length)
{
a[i]=s.nextInt();
i++;
}
for(i=0;i<a.length-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
System.out.print("First repeated element");
break;
}
}
}
}
}
