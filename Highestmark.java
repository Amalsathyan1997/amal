import java.util.*;
class Highestmark
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int flag=0;
         int[] marks=new int[6];
         for(int i=0;i<6;i++)
         {
           marks[i]=sc.nextInt();
         if(marks[i]<0)
            {
                flag=1;
               break;
            }
         }
        if(flag==1)
        {
            System.out.println("Invalid mark");
        }
         else
         {
           int max=marks[0];
             for(int i=1;i<6;i++)
             {
              if(marks[i]>max)
              {
                  max=marks[i];
              }
         }
         System.out.println("Highest mark is "+max);
        }
    }
}