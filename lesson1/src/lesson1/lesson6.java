package lesson1;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      JFrame frame = new JFrame( "Hello my friend!");
      frame.add( new HelloComponent2("Hello! Go cs:go") );
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 300);
      frame.setVisible(true);
      
      
      
  }// end of main
}// end of class

class HelloComponent2 extends JComponent
   implements MouseMotionListener, ActionListener, Runnable
{
	String theMessage;
	int messageX = 125, messageY = 95; // Coordinates  of the message
	
	JButton theButton;
	
	int colorIndex;
	static Color[] someColors = {
			Color.orange, Color.black, Color.green, Color.blue, Color.magenta };
	
	
	public HelloComponent2( String message ) {
		theMessage = message;
		
		theButton = new JButton("Change color");
		setLayout( new FlowLayout() );
		add( theButton );
		theButton.addActionListener( this );
		addMouseMotionListener(this);
		
		
	}//end of helloComponent 
	
  public void paintComponent( Graphics g ) {
	  g.drawString( theMessage,messageX , messageY);
	  
  }
  
  public void mouseDragged(MouseEvent e) {
  // Save the mouse coordinates and paint the message.
	  messageX = e.getX();
	  messageY = e.getY();
  }

	// TODO Auto-generated method stub
	public void actionPerformed( ActionEvent e ) {
		if (e.getSource() == theButton)
			changeColor();
	}
	
   synchronized private void changeColor() {
        if (++colorIndex == someColors.length)
	  colorIndex = 0;
        setForeground( currentColor() );
        repaint();
   }
        synchronized private Color currentColor() {
        	return someColors[colorIndex];
        	
        	
        }

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
} // end of class


