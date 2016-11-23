/*
 * 事件监听，实现控制小球运动
 */

package njit.monitor2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.tools.JavaCompiler;


import org.omg.CORBA.PUBLIC_MEMBER;

public class Monitor2 extends JFrame{

	MyPanel mp=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor2 tankgame3=new Monitor2();
	}
	public Monitor2(){
		
		mp=new MyPanel();
		

		this.add(mp);
		this.addKeyListener(mp);
		
		this.setTitle("控球运动");
		this.setSize(400,300);
		this.setLocation(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}

class MyPanel extends JPanel implements KeyListener{
	
	int x=20,y=20;
	
	public void paint(Graphics g){
		
		super.paint(g);
		
		g.fillOval(x, y, 20, 20);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//System.out.println(e.getKeyChar());
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			//System.out.println("下");
			y+=2;
		}else if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			y-=2;	
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			x-=2;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			x+=2;
		}
		
		repaint();
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
