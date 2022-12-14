import java.util.Random;
import java.util.Arrays;
class Main1
{
 
  public static void main(String []args)
  {
    Random r = new Random() ;
    int min , max ;
    int arr[] = new int[1000];
    for(int i = 0 ; i < arr.length ; i++)
    {
     arr[i] = r.nextInt(1000);
    }  
    min = arr[0];
    max = arr[0];
    
    long start  = System.nanoTime (); 
 
     for(int i = 0 ; i < arr.length ; i++)
    {
      if(min < arr[i])
       min = arr[i];
      
      else if(max > arr[i])
       max = arr[i];
    }  
    long end    = System.nanoTime ();
    System.out.print("The Max number is :"+max+'\n'+"The min number is :"+min+'\n');
    System.out.print("excuytion Time is :"+(end - start)+'\n');
  }
}
