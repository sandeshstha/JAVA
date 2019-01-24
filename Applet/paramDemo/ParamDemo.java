import java.awt.*;
import java.applet.*;
public class ParamDemo extends Applet
{
	String fontName;
	int fontSize;
	float leading;
	boolean active;
	public void start()
	{
		String param;
		fontName = getParameter("fontName");
		if(fontName == null)
		{
			fontName = "not found";
		}

		param = getParameter("fontSize");

		try
		{
			if(param != null)
			{
				fontSize = Integer.parseInt(param);
			}
			else
			{
				fontSize =0;
			}
		}
		catch(NumberFormatException e)
		{
			fontSize = -1;
		}

		param = getParameter("leading");
		{
			try
			{
				if(param != null)
				{
					leading = Float.valueOf(param).floatValue();
				}
				else
					leading = 0;
			}
			catch(NumberFormatException e)
			{
				leading = -1;
			}
		}
		
		// param = getParameter("accountEnabled");
		// 	try
		// 	{
		// 		if(param != null)
		// 		{
		// 			active = Boolean.valueOf(param).booleanValue();
		// 		}
		// 		else
		// 			active = 0;
		// 	}
		// 	catch(NumberFormatException e)
		// 	{
		// 		active = -1;
		// 	}
	}

		public void paint(Graphics g)
		{
			g.drawString("Font name:"+fontName,100,100);
			g.drawString("Font size:"+fontSize,100,100);
			// g.drawString("leading:"+fontName,100,100);
			// g.drawString("Font name:"+fontName,100,100);

		}

}