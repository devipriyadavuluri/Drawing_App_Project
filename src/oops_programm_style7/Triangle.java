   package oops_programm_style7;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(String color, Outline outline,int base,int height) {
		super(color, outline);
		boolean baseStatus=TriangleValidation.verifyBase(base);
		boolean heightStatus=TriangleValidation.verifyHeight(height);
		if(baseStatus)
		
			this.base=base;
		
		else
		
			System.err.println("invalid base value");
		
		if(heightStatus)
		
			this.height=height;
		
		else
		
			System.err.println(" invalid height value:");
		
		
	}
	public void setBase(int base)
	{
		this.base=base;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public int getBase()
	{
		return base;
	}
	public int getHeight()
	{
		return height;
	}
	@Override
	public void findArea() {
		double area=0.5*base*height;
		System.out.println("area of tringle:"+area);
		
	}

	@Override
	public void view() {
		shapeDetails() ;
		System.out.println("height:"+getHeight()+ " cm");
		System.out.println("base:"+getBase()+ " cm");
	}

}
