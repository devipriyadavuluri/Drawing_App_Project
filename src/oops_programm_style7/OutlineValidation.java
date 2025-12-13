package oops_programm_style7;

public class OutlineValidation {
	public static boolean verifyThickness(double thickness)
	{
		if(thickness>=0.25 && thickness<=6.0)
			return true;
		else
		   return false;
	}
     public static boolean verifyColor(String color)
     {
    	 String colours[]= {"RED","YELLOW","GREEN","BLUE","PURPLE"};
    	 for(int i=0; i<colours.length; i++)
    	 {
    		 if(colours[i].equalsIgnoreCase(color))
    			 return true;
    	 }
		return false;
     }
     
     public static boolean verifyStyle(String style)
     {
    	 if(style.equalsIgnoreCase("solid") || style.equalsIgnoreCase("dotted"))
    		 return true;
    	 else
    		 return false;
     }
}
