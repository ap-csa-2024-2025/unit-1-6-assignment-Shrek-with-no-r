public class Problem3
{
  public static void main(String[] args)
  {
    double num1 = 53.329;
    double num2;
    double num3;
    num1 = (num1 %= 10)/10;
    num2 = (num1 %= 10)/100;
    num3 = (num1 %= 10)/1000;


    System.out.println(num1 + " " + num2 + " " + num3);
  }
}


