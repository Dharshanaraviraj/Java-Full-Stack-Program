package Assigment;
import java.util.Scanner;
public class Rectangle {
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Height : ");
			int height=sc.nextInt();
			System.out.println("Enter the Width : ");
			int width=sc.nextInt();
			double area=height*width;
			double perimeter=2*(height+width);
			System.out.println("Area of rectangle: "+area);
			System.out.println("Perimeter of rectangle: "+perimeter);
			
			}

	}

