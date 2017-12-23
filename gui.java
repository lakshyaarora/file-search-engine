import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import java.util.*;
  import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
 class FSE extends JFrame implements ActionListener {
	JTextField tf;
	JLabel jl;
	JButton b; 
	JFrame jf;
        JLabel d;
        JTextField dirname;
        JButton c;
        
	public FSE()
	{
		//jf=new JFrame("File-Search-Engine");
		this.setSize(400, 500);
		this.setLayout(null);
		jl=new JLabel("Filename");
		jl.setBounds(10,40 , 100, 20);
		this.add(jl);
		tf=new JTextField();
		tf.setBounds(10, 80, 100, 40);
		this.add(tf);

             d=new JLabel("Directory");
		d.setBounds(10, 150, 100, 20);
		this.add(d);
		dirname=new JTextField();
		dirname.setBounds(10, 200, 100, 40);
		this.add(dirname);
                
		b=new JButton("search");
		b.setBounds(10, 250, 100, 20);
                b.addActionListener(this);
		this.add(b);
		
                //c=new JButton("cancel");
		//c.setBounds(140, 20, 100, 20);
		//jf.add(c);
		//c.addActionListener(this);
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
  System.out.println("searching");

String filename=tf.getText();
//String all=new String("all");
String  directory=dirname.getText();
System.out.println(directory);


filesearch s=new filesearch();
//s.findfile(new File(directory),filename);

s.start(new File(directory),filename);

		
	}

}