package oops_programm_style4;

public class CircleValidation {
	public static boolean checkStatus( int r)
	{
		if(r>=5 && r<=10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyColour(String color)
	{
		boolean status=false;
		String colours[]= {"red","green","yellow","pink"};
		for(int i=0; i<colours.length; i++)
		{
			if(color.equalsIgnoreCase(colours[i]))
			{
				status=true;
			}
				
		}
		return status;
		
	}

}
