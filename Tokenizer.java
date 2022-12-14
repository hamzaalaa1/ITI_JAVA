import java.util.StringTokenizer;
class Tokenizer
{
 public static void main(String args[])
 {
  StringTokenizer sT = new StringTokenizer​("hamza alaa fakhr eldean"," ");
   while(sT.hasMoreTokens())
   {
     System.out.println(sT.nextToken());
   }
 }
}
