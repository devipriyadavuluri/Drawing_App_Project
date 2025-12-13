package oops_programm_style4;

public class Rectangle {
	private int l;
	private int w;
	private String color;
	private String unit;

	
	public Rectangle(int l,int w,String color,String unit)
	{  
		/*int status=RectangleValidation.lengthStatus(l);
		if(status==1)
		{
			this.l=l;
		}
		else
		{
			System.err.println("invalid value");
		}
		int res=RectangleValidation.widthStatus(w);
		if(res==1)
		{
			this.w=w;
		}
		else
		{
			System.err.println("invalid value");
		}*/


		if(RectangleValidation.verifyColour(color))
		{
				this.color=color;
		}
		else
		{
				System.err.println("invalid color");
		}
		 if(RectangleValidation.checkMethods(unit, l, w))
			{
				this.unit=unit;
				this.l=l;
				this.w=w;
			}
			else
			{
				System.out.println("invalid values are given");
			}
	}
	public Rectangle()
	{
		this(12,8,"RED","cm");
	}
	public Rectangle(int l,int w)
	{
		this(l,w,"RED","cm");
	}
	public Rectangle(int l,int w,String color)
	{
		this(l,w,color,"cm");
	}
	public void Area()
	{
		int area=l*w;
		System.out.println("Area of Rectangle is:" +area);
    }
	public int Calculateperimeter()
	{
		int perimeter=2*(l+w);
		return perimeter;
	}
	public boolean isPorait()
	{
		if(l>w)
		{
			return true;
		}
		return false;
	}
	public boolean isLandscape()
	{
		if(l<w)
		{
			return true;
		}
		return false;
	}
	public void detailsOfRectangle()
	{
		System.out.println("length :"+l);
		System.out.println("width:"+w);
		System.out.println("perimeter of rectangle is:"+Calculateperimeter());
		Area();
	}
	
}
