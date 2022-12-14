import java.util.function.Function;
 
class Converter implements  Function<Float,Float>
{
   @Override
   public Float apply(Float x)
   {
      return (x*(5/9)+32);     
   }

  public static void main(String args[])
  {
    Converter convert = new Converter();
    System.out.print("the value befor conversion "+ args[0]+"\nvalue after conversion "+convert.apply((float) Integer.parseInt(args[0]))+"\n");
    }
}
	
