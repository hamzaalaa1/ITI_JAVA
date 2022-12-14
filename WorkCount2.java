class WordCount2
{
	public static void main(String args[])
 	{
 	      
 	      int index = 0 ; 
 	 
 	      int counter = 0;
              String sentacne = "hello i am hamza hamza alaa hamza from tanta i am hamza 22 years old hamza";
             
               
               while((index = sentacne.indexOf​("hamza",index)) != -1)
               {
                   index ++;
                   counter ++;
               }
                System.out.println("the count of word hamza :"+counter);
              
	}
}
 	 
