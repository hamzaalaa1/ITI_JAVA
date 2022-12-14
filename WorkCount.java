class WordCount
{
	public static void main(String args[])
 	{
              String arr[] = "hello i am hamza hamza alaa hamza from tanta i am hamza 22 years old hamza".split(" ");
              int counter = 0 ; 
             for(int i = 0 ; i < arr.length ; i++)
             {
               if (arr[i].equals("hamza"))
                 counter ++ ;
             }
             System.out.print("The number of occurance is :"+counter+"\n");
	}
}
