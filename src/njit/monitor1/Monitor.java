/*
 * 监听
 */
package njit.monitor1;

import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

import javax.swing.*;

public class Monitor extends JFrame implements ActionListener{

	JPanel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitor=new Monitor();
	}
	
	/**
	 * 
	 */
	/**
	 * 
	 */
	public Monitor () {
		
		mp=new JPanel();
		mp.setBackground(Color.black);
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		
		Cat cat1=new Cat();
		//注册监听
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		jb1.addActionListener(cat1);
		jb2.addActionListener(cat1);
		
		//指定action命令
		jb1.setActionCommand("jb1");
		jb2.setActionCommand("jb2");
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setTitle("监听");
		this.setSize(400,300);
		this.setLocation(100,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	//事件处理方法
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("开始调用");
		if(e.getActionCommand().equals("jb1"))
		{
			mp.setBackground(Color.black);
		}else if (e.getActionCommand().equals("jb2")) {
			mp.setBackground(Color.red);
		}else {
			System.out.println("nothing");
		}	
		
		
	}

}
class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e2) {
		// TODO Auto-generated method stub
		if(e2.getActionCommand().equals("jb1"))
		{
			System.out.println("点击了黑色按钮");
		}else if (e2.getActionCommand().equals("jb2")) {
			System.out.println("点击了红色按钮");
		}
	}
	
	
}


