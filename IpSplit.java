import java.util.StringTokenizer;
class IpSplit
{
   public static void main(String args[])
   {
     StringTokenizer ip = new StringTokenizerâ€‹("192.168.2.1",".");
     while(ip.hasMoreTokens())
     {
       System.out.println("Octet :"+ip.nextToken());
     } 
     
   }
}

