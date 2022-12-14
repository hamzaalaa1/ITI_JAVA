import java.util.Random;
import java.util.Arrays;
class Main
{
    public  static int binarySearch(int arr[],int start,int end , int value)
    {
        int  m = (start +  end) / 2;
        if(start > end)
        {
            return -1 ;
        }
         else if(arr[m] < value)
             return  binarySearch(arr , m+1 , end , value);
          else if (arr[m] > value)
              return   binarySearch(arr,start ,m-1 ,value);

          return  m ;
    }
  public static void main(String []args)
  {
    Random r = new Random() ;
    int arr[] = new int[100];
    for(int i = 0 ; i < arr.length ; i++)
    {
     arr[i] = r.nextInt(10);
    }  
    Arrays.sort(arr);
      
    long start  = System.nanoTime ();
    int result  = binarySearch(arr,0,arr.length-1,2);
    long end    = System.nanoTime ();
  
    if(result > 0)
    {
      System.out.print("The value exists"+'\u2713'+"\n"+"At index "+result+'\n'+"With excutoin time "+ (end - start)+"ns"+"\n");
    }
    else 
    {
     System.out.print("Number not found in array !\n");
     }
  }
}
