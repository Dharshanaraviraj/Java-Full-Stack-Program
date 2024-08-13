import java.util.Scanner;
public class Fibonacci{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the terms in series: ");
    int n = sc.nextInt();
    int firstvalue = 0,secondvalue = 1;
    for(int i=0;i<n;i++)
    {
       System.out.println(firstvalue+" ");
       int thirdvalue = secondvalue+firstvalue;
       firstvalue = secondvalue;
       secondvalue =thirdvalue;
   }
  }
}