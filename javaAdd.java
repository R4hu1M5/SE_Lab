import java.util.Scanner;

public class javaAdd
{
  public static void main(String args[])
  {
    float a, b, res;
    char choice, ch;
    Scanner scan = new Scanner(System.in);
    do
    {
      System.out.print("1. Add Two Numbers\n");
      System.out.print("2. Multiply Two Numbers\n");
      System.out.print("3. Exit\n\n");
      System.out.print("Enter your choice: ");
      choice = scan.next().charAt(0);
      switch(choice)
      {
        case '1': System.out.print("Enter Two Numbers: ");
                  a = scan.nextFloat();
                  b = scan.nextFloat();
                  res = a + b;
                  System.out.print("Result = " + res);
                  break;
        case '3': System.exit(0);
                  break;
        default:  System.out.print("Invalid Choice");
                  break;
      }
      System.out.print("\n-------------\n");
    }
    while (choice != 2);
  }
}
