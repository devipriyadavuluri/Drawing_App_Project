package oops_programm_style3;

public class RectangleValidation {
	public static int lengthStatus(int l)
	{
		if(l>=10 && l<=30)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int  widthStatus(int w)
	{
		if(w>=6 && w<=14)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
