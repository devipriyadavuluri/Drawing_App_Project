package oops_programm_style3;

public class Rectangle {
	private int l;
	private int w;
	public void dimension(int l, int w)
	{
        int status=RectangleValidation.lengthStatus(l);
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
		}
	}
	
	
	public void Area()
	{
		int area=l*w;
		System.out.println("Area of Rectangle is:"+area);
    }
	public void detailsOfRectangle()
	{
		System.out.println("length :"+l);
		System.out.println("width:"+w);
		Area();
	}
	
}
