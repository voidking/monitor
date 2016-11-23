/*
 * ������ȫ
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
 
    //���캯��
    public Monitor3()
    {
       mp=new MyPanel();
       
       this.addMouseListener(mp);
       this.addKeyListener(mp);
       this.addMouseMotionListener(mp);
       this.addWindowListener(mp);
       
       this.add(mp);
       
       this.setTitle("������ȫ");
       this.setSize(400, 300);
       this.setLocation(400,400);
       this.setVisible(true);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
      
    }
   
}
//��MyPanel֪����갴�µ���Ϣ��������֪�����λ�õ�����
//��MyPanel֪���ĸ���������
//��MyPanel֪������ƶ�����ק
//��MyPanel֪�����ڵı仯���رա���󻯡���С����
 
class MyPanel extends JPanel implements WindowListener,MouseListener,KeyListener,MouseMotionListener
{
    public void paint (Graphics g)
    {
       super.paint(g);
   
    }
 
    //�����
    public void mouseClicked(MouseEvent e) {
      
       System.out.println("���x="+e.getX()+"  "+"y="+e.getY());
    }
 
    //����ƶ���MyPanel
    public void mouseEntered(MouseEvent e) {
       System.out.println("������ˣ�");
    }
 
    //����뿪
    public void mouseExited(MouseEvent e) {
      System.out.println("�������");
    }
 
    //��갴��
    public void mousePressed(MouseEvent e) {
      System.out.println("mousePressed");
    }
 
    //����ɿ�
    public void mouseReleased(MouseEvent e) {
      System.out.println("mouseReleased");
    }
 
    //������ û���ɿ�
    public void keyPressed(KeyEvent e) {
       System.out.println(e.getKeyChar()+"��������");
      
    }
 
    //���ɿ�
    public void keyReleased(KeyEvent e) {
      System.out.println(e.getKeyChar()+"�����ɿ�");
    }
 
    //�����룬Ҫ���о��������
    public void keyTyped(KeyEvent e) {
      System.out.println(e.getKeyChar()+"  keyTyped");
    }
 
    //�����ק
    public void mouseDragged(MouseEvent e) {
      System.out.println("mouseDragged");
    }
 
    //����ƶ�
    public void mouseMoved(MouseEvent e) {
       //System.out.println("���x="+e.getX()+"  "+"y="+e.getY());
      
    }
 
    //���ڼ�����
    public void windowActivated(WindowEvent e) {
       System.out.println("���ڼ�����");
 
    }
 
    //���ڹر���
    public void windowClosed(WindowEvent e) {
       System.out.println("���ڹر���");
    }
 
    //�������ڹر�
    public void windowClosing(WindowEvent e) {
       System.out.println("�������ڹر�");
    }
 
    //���ڷǻ�Ծ״̬
    public void windowDeactivated(WindowEvent e) {
    	System.out.println("���ڷǻ�Ծ");
    }
 
    //���ڻ�ԭ
    public void windowDeiconified(WindowEvent e) {
      System.out.println("windowDeiconified");
    }
    //������С��
    public void windowIconified(WindowEvent e) {
      System.out.println("windowIconified");
    }
 
    //���ڴ���
    public void windowOpened(WindowEvent e) {
       System.out.println("���ڴ���");
    }
}

