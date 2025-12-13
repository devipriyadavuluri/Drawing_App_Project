 package oops_programm_style6;

public class TriangleValidation {
	public static boolean verifyBase(int base)
	{
		if(base>=5 && base<=10)
		{
			return true;
		}
		return false;
	}
	
	public static boolean verifyHeight(int height)
	{
		if(height>=7 && height<=30)
		{
			return true;
		}
		return false;
	}

}
