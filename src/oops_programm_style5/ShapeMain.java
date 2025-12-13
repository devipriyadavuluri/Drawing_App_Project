package oops_programm_style5;

public class ShapeMain {
	public static void main(String[] args)
	{
		System.out.println("-------Triangle details--------");
		Triangle triangle=new Triangle("yellow", 4, 6, 25);
		triangle.TriangleDetails();
		
		System.out.println("---------Hexagon details-------");
		Hexagon hex=new Hexagon("blue",5);
		hex.display();
		
		System.out.println("----------pentagon details-----");
		Pentagon pen=new Pentagon("red",8);
		pen.display();
		
	}

}
