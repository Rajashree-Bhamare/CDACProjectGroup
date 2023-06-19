import java.util.Scanner;
public class Array 
{
 public static void main(String [] args)
 {
   /*int []a=new int[5]; 
   a[0]=1;
   a[1]=2;
   a[2]=1;
   a[3]=3;
   a[4]=4;*/
   
   //int []a={1,2,1,3,4};
   
   Scanner sc=new Scanner(System.in);
   
   int []a=new int[5];
   System.out.println("Enter values");
   
    a[0]=sc.nextInt();
    a[1]=sc.nextInt();
    a[2]=sc.nextInt();
    a[3]=sc.nextInt();
    a[4]=sc.nextInt();
   
   
   
   for(int i=0;i<a.length;i++)
   {
    System.out.println(a[i]);
   }
   
 }
} 