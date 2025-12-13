package oops_programm_style5;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(String color, int outline,int base,int height) {
		super(color, outline);
		boolean baseStatus=TriangleValidation.verifyBase(base);
		boolean heightStatus=TriangleValidation.verifyHeight(height);
		if(baseStatus)
		{
			this.base=base;
		}
		else
		{
			System.err.println("invalid base value");
		}
		if(heightStatus)
		{
			this.height=height;
		}
		else
		{
			System.err.println(" invalid height value:");
		}
		
	}
	
	public void TriangleDetails()
	{
		display();
		System.out.println("base :"+base + " cm");
		System.out.println("height :"+height + " cm");
		
	}

}
