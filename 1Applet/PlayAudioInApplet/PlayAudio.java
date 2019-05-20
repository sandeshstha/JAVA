import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code = "PlayAudio" height = "500" width = "500">
	</applet>
*/
	public class PlayAudio extends Applet implements ActionListener
	{
		AudioClip acRef;
		Button play, stop,loop;
		public void init()
		{
			acRef = getAudioClip(getDocumentBase(),"sound.wav");
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
			if(e.getSource()==play)
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