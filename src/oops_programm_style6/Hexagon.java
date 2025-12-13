 package oops_programm_style6;

public class Hexagon extends Shape{
	private int side;
	public Hexagon(String color,int outline,int side)
	{
		super(color,outline);
		if(HexagonValidation.verifySide(side))
		{
			this.side=side;
		}
		else
		{
			System.err.print("invalid side of hexagon");
		}
	}

	@Override
	public void findArea() {
		double area=3/2.0*Math.sqrt(3)*side*side;
		System.out.println("area of hexagon:"+area+"SQ.MM");
	
		
	}
	@Override
	public void view() {
		shapeDetails() ;
		System.out.println("hexagon side :"+side+"cm");
	}

	

}
