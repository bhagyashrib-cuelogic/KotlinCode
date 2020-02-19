public class Add {
    public static void main (String args[]){
       Sub obj = new Sub();
       obj.Sub();
       Multiblication mulObj = new Multiblication();
       //int result =mulObj.mult(2,3);
     //  System.out.println("Multiplication is "+result);
    }
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition is " + result);
    }

    public int mult(int a,int b)
    {
        int mul=a*b;
        return mul;
    }
}
//calling kotlin function into java class
 class Sub
{
    public void Sub() {
        //use here kotlin fun into java class
       // int sub = AddfunKt.Sub(9,8);
        int sub = kotlinClass.Sub(9,8); //by accessing file Name
        System.out.println("Subtraction is " + sub);
    }
}
//use return function
class Multiblication
{

}
