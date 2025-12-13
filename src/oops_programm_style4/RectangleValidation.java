package oops_programm_style4;

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
	public static boolean verifyColour(String color)
	{
		boolean status=false;
		String colors[]= {"red","blue","green","yellow","black"};
		for(int i=0; i<colors.length; i++)
		{
			if(color.equalsIgnoreCase(colors[i]))
			{
				status=true;
			}
		}
		return status;
	}
	public static boolean verifycmLength(int l)
	{
		if(l>=10 && l<=30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifycmWidth(int w)
	{
		if(w>=6 && w>=14)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyInchLength(int l)
	{
		if(l>=4 && l<=12)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyInchWidth(int w)
	{
		if(w>=2 && w<=6)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyMMLength(int l)
	{
		if(l>=100 && l<=300)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyMMWidth(int w)
	{
		if(w>=60 && w<=140)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean checkMethods(String str,int l,int w)
	{
		String units[]= {"cm","mm","inch"};
		for(int i=0; i<str.length(); i++)
		{
			if(str.equalsIgnoreCase(units[i]))
			{
				switch(str)
				{
				case "cm":
					verifycmLength(l);
					verifycmWidth(w);
					break;
				case "mm":
					verifyMMLength(l);
					verifyMMWidth(w);
					break;
				case "inch":
					verifyInchLength(l);
					verifyInchWidth(w);
					break;
				
				}
				return true;
			}
		}
		return false;
		
	}
	
	
	
}