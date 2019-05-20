import java.awt.*;
import java.applet.*;
/*
	<applet code = "ParamDemo" width = "100" height = "100" align= "center">
	<param name="fontName" value = "Arial">
	<param name="fontSize" value = "14">
	</applet>
*/
	public class ParamDemo extends Applet 
	{
		String fN;
		int fS;
		@Override
		public void init()
		{
			String param;

			fN = getParameter("fontName");
			if(fN == null)
			{
				fN = "not found";
			}
			try
			{

				param = getParameter("fontSize");
				if(param!=null)
				{
					fS = Integer.parseInt(param);
				}
				else
				{
					fS = 10;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
		public void paint(Graphics g)
		{
			g.drawString("fontname is:"+fN,200,200);
			g.drawString("fontSize is:"+fS,240,240);
		}
	}