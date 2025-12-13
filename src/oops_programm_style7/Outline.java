package oops_programm_style7;

public class Outline {
	private double thickness;
	private String style;
	private String color;
	public Outline()
	{
		
	}
	public Outline(double thickness, String style, String color) {
		if(OutlineValidation.verifyThickness(thickness))
		       this.thickness = thickness;
		else
			System.err.println("invalid thickness......");
		if(OutlineValidation.verifyStyle(style))
		     this.style = style;
		else
			System.err.println("invalid style......");
		if(OutlineValidation.verifyColor(color))
		     this.color = color;
		else
			System.err.println("invalid color......");
	}
	public void showDetails()
	{
		System.out.println("outline thickness :"+thickness);
		System.out.println("outline style:"+style);
		System.out.println("outline color:"+color);
	}
	
	

}
