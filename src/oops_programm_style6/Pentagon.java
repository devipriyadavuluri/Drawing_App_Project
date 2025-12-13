 package oops_programm_style6;

public class Pentagon extends Shape{
	private int side;

	public Pentagon(String color, int outline,int side) {
		super(color, outline);
		if(PentagonValidation.verifySide(side))
		{
			this.side=side;
		}
		else
		{
			System.err.println("invalid side in pentagon");
		}
	}

	@Override
	public void findArea() {
		double area=1/4.0*(Math.sqrt(5*(5+2*(Math.sqrt(5)))))*side*side;
		System.out.println("area of pentgon: "+area +"cm");
	
	}

	@Override
	public void view() {
		shapeDetails();
		System.out.println("pentagon side:"+side+"SQ.CM");
		
		
	}

}
