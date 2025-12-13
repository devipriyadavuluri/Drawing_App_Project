package oops_programm_style6;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args)
	{
		Shape shape=null;
		System.out.println("-----------Welcome--------");
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter press 1 Triangle");
		System.out.println("enter press 2 Pentagon");
		System.out.println("enter press 3 Hexagon");
		System.out.println("enter your choice ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter colour:");
			String color=sc.next();
			System.out.println("enter outline:");
			int outline=sc.nextInt();
			System.out.println("enter base:");
			int base=sc.nextInt();
			System.out.println("enter height:");
			int height=sc.nextInt();
			shape= (Shape) new Triangle(color, outline, base, height);
			break;
		case 2:
			System.out.println("enter colour:");
			String color1=sc.next();
			System.out.println("enter outline:");
			int outline1=sc.nextInt();
			System.out.println("enter side");
			int side=sc.nextInt();
			shape=(Shape)new Pentagon(color1, outline1, side);
			break;
		case 3:
			System.out.println("enter colour");
			String color2=sc.next();
			System.out.println("enter outline");
			int outline2=sc.nextInt();
			System.out.println("enter side");
			int side1=sc.nextInt();
			shape=(Shape) new Hexagon(color2,outline2,side1);
			break;	
		}
		shape.findArea();
		shape.view();
		System.out.println("press 1 continue ");
		System.out.println("press 0 stop ");
		int contStop=sc.nextInt();
		if(contStop==0)
		{
			break;
		}
			
		
		}while(true);
		System.out.println("-----------othank you-----------");
	
	
		
	}

}
