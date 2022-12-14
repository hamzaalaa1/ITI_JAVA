 import java.util.function.*;
 
class Result
{
  private double value1  ;
  private double value2  ;
  
  public Result(double value1 , double value2)
  {
    this.value1 = value1 ; 
    this.value2 = value2 ;
  }
  @Override
  public String toString()
  {
   return "the resutl is :"+value1+"\n"+"the result is :"+value2+"\n";
  }
}
class Holder
{
   double a ;
   double b ; 
   double c ;
   
   Holder(double a, double b , double c)
   {
    this.a =a ;
    this.b = b ;
    this.c = c ;
   }
}
 
class MyOwnInterface implements Function<Holder,Result>
{
@Override
      public Result apply(Holder h)
        {
        
         double ac = h.a * h.c * 4;
         double a2 = 2 * h.a ;
         double sqr =  Math.sqrt((h.b*h.b) - ac);
         return new Result(((-h.b+sqr)/a2),((-h.b-sqr)/a2) );
        }
  public static void main(String args[])
  {
    MyOwnInterface m = new MyOwnInterface() ; 
    Holder h = new Holder(Float.parseFloat(args[0]),Float.parseFloat(args[1]),Float.parseFloat(args[2])) ;
    Result r= m.apply(h);
    System.out.print(r);
  }
}
