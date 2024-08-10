import java.util.Scanner;

public class MyClass3{
  public static void main(String args[]) {
  int a;
  int b;

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a");
  a=sc.nextInt();
  System.out.println("Enter b");
  b=sc.nextInt();

  if(a<b){
  System.out.println("a is smaller than b");
  }

  else{
  System.out.println("a is larger than b");
  }

  }
}