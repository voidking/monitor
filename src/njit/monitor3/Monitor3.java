/*
 * 监听大全
 */
package njit.monitor3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class Monitor3 extends JFrame
{
    MyPanel mp=null;
   
    public static void main(String[] args)
    {
       Monitor3 demo9_5=new Monitor3();
    }
 
    //构造函数
    public Monitor3()
    {
       mp=new MyPanel();
       
       this.addMouseListener(mp);
       this.addKeyListener(mp);
       this.addMouseMotionListener(mp);
       this.addWindowListener(mp);
       
       this.add(mp);
       
       this.setTitle("监听大全");
       this.setSize(400, 300);
       this.setLocation(400,400);
       this.setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
      
    }
   
}
//让MyPanel知道鼠标按下的消息，并且能知道点击位置的坐标
//让MyPanel知道哪个键按下了
//让MyPanel知道鼠标移动，拖拽
//让MyPanel知道窗口的变化（关闭、最大化、最小化）
 
class MyPanel extends JPanel implements WindowListener,MouseListener,KeyListener,MouseMotionListener
{
    public void paint (Graphics g)
    {
       super.paint(g);
   
    }
 
    //鼠标点击
    public void mouseClicked(MouseEvent e) {
      
       System.out.println("鼠标x="+e.getX()+"  "+"y="+e.getY());
    }
 
    //鼠标移动到MyPanel
    public void mouseEntered(MouseEvent e) {
       System.out.println("鼠标来了！");
    }
 
    //鼠标离开
    public void mouseExited(MouseEvent e) {
      System.out.println("鼠标走了");
    }
 
    //鼠标按下
    public void mousePressed(MouseEvent e) {
      System.out.println("mousePressed");
    }
 
    //鼠标松开
    public void mouseReleased(MouseEvent e) {
      System.out.println("mouseReleased");
    }
 
    //键按下 没有松开
    public void keyPressed(KeyEvent e) {
       System.out.println(e.getKeyChar()+"键被按下");
      
    }
 
    //键松开
    public void keyReleased(KeyEvent e) {
      System.out.println(e.getKeyChar()+"键被松开");
    }
 
    //键输入，要求有具体的输入
    public void keyTyped(KeyEvent e) {
      System.out.println(e.getKeyChar()+"  keyTyped");
    }
 
    //鼠标拖拽
    public void mouseDragged(MouseEvent e) {
      System.out.println("mouseDragged");
    }
 
    //鼠标移动
    public void mouseMoved(MouseEvent e) {
       //System.out.println("鼠标x="+e.getX()+"  "+"y="+e.getY());
      
    }
 
    //窗口激活了
    public void windowActivated(WindowEvent e) {
       System.out.println("窗口激活了");
 
    }
 
    //窗口关闭了
    public void windowClosed(WindowEvent e) {
       System.out.println("窗口关闭了");
    }
 
    //窗口正在关闭
    public void windowClosing(WindowEvent e) {
       System.out.println("窗口正在关闭");
    }
 
    //窗口非活跃状态
    public void windowDeactivated(WindowEvent e) {
    	System.out.println("窗口非活跃");
    }
 
    //窗口还原
    public void windowDeiconified(WindowEvent e) {
      System.out.println("windowDeiconified");
    }
    //窗口最小化
    public void windowIconified(WindowEvent e) {
      System.out.println("windowIconified");
    }
 
    //窗口打开了
    public void windowOpened(WindowEvent e) {
       System.out.println("窗口打开了");
    }
}

