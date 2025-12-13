package oops_programm_style4;

public class HexagonValidation {
		public static boolean verifyColor(String col)
		{
			boolean status=false;
			String colours[]= {"yellow","orange","blue"};
			for(int i=0; i<colours.length; i++)
			{
				if(col.equalsIgnoreCase(colours[i]))
					return status=true;
			}
			return status;
		}

		
		
		public static boolean verifythickness(int outline)
		{
			if(outline>=1 && outline<=10)
			{
				return true;
			}
			return false;
		}
	}



