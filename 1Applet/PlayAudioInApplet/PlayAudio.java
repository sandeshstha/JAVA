import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code = "PlayAudio" height = "500" width = "500">
		<param name = "audioname" value="sound.wav">
	</applet>
*/
	public class PlayAudio extends Applet implements ActionListener
	{
		AudioClip acRef;
		Button play, stop,loop;
		public void init()
		{
			String audioName = getParameter("audioname");

			acRef = getAudioClip(getDocumentBase(),audioName);
			play = new Button("PLAY");
			stop = new Button("STOP");
			loop = new Button("REPEAT");

			add(play);
			add(stop);
			add(loop);

			play.addActionListener(this);
			stop.addActionListener(this);
			loop.addActionListener(this);

		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==play) //returns Button Reference
			{
				acRef.play();
			}
			else if(e.getSource() == stop)
			{
				acRef.stop();
			}
			else if(e.getSource() == loop)
			{
				acRef.loop();
			}
		}

	}