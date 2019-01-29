// important program
import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet
{
	Image picture;
	public void init()
	{
		// picture = getImage(path,)
		// java will allow the applet to load data from the directory holding the html file that started the applet(the documentbase )
		// and the directory from which the applet class file was loaded(the codebase(.class file bhako samma ko location))
		// both getDocumentBase()+> gives .java bhako thau samma ko path dinxa and getCodeBase() method return directories and url objects respectively
		picture = getImage(getDocumentBase(),"image.png");
	}
	public void paint(Graphics g)
	{
		// g.drawImage(image object,x coordinates,y coordinates,location of image observer);
		g.drawImage(picture,30,60,this);

	}
}
