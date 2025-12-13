package oops_programm_style7;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args)
	{
		Shape shape=null;
		System.out.println("-----------Welcome--------");
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter press 1  for Triangle");
		System.out.println("enter press 2  for Pentagon");
		System.out.println("enter press 3  for  Hexagon");
		System.out.println("enter your choice ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the colour :");
			String tc=sc.next();
			System.out.println("enter triangle outline thickness:");
			double tot=sc.nextDouble();
			System.out.println("enter triangle outline style:");
			String tos=sc.next();
			System.out.println("enter traingle outline color:");
			String toc=sc.next();
			System.out.println("enter base:");
			int tb=sc.nextInt();
			System.out.println("enter height:");
			int th=sc.nextInt();
			System.out.println("do you want outline :");
			String outline=sc.next();
			if(outline.equalsIgnoreCase("no"))
			shape= (Shape) new Triangle(tc, new Outline(), tb, th);
			else
				shape= (Shape) new Triangle(tc, new Outline(tot,tos,toc), tb, th);
			break;
		case 2:
			System.out.println("enter pentagon colour");
			String pc=sc.next();
			System.out.println("enter pentagon outline thickness");
			double pot=sc.nextDouble();
			System.out.println("enter pentagon outline style :");
			String  pos=sc.next();
			System.out.println("enter pentagon outline color :");
			String poc=sc.next();
            System.out.println("enter pentagon side");
            int ps=sc.nextInt();
            System.out.println("do you need outline :");
            String outlinepenta=sc.next();
            if(outlinepenta.endsWith("no"))
			shape=(Shape) new Pentagon(pc,new Outline(),ps);
            else
            	shape=new Pentagon(pc, new Outline(pot,pos,poc), ps);
			break;	
			
		case 3:
			System.out.println("enter hexagon colour");
			String hc=sc.next();
			System.out.println("enter hexagon outline thickness");
			double hot=sc.nextDouble();
			System.out.println("enter hexagon outline style :");
			String  hos=sc.next();
			System.out.println("enter hexagon outline color :");
			String hoc=sc.next();
            System.out.println("enter hexagon side");
            int hs=sc.nextInt();
            System.out.println("do you need outline :");
            String outlinehexa=sc.next();
            if(outlinehexa.endsWith("no"))
			shape=(Shape) new Hexagon(hc,new Outline(),hs);
            else
            	shape=new Hexagon(hc, new Outline(hot,hos,hoc), hs);
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
