package chatBot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatBot extends JFrame{

	private JTextField tf=new JTextField();
	private JTextArea ta=new JTextArea();
	public ChatBot()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,600);
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("javaAI");
		this.setLayout(null);
		
		tf.setLocation(2,540);
		tf.setSize(590,30);
		
		tf.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				String utext=tf.getText();
				ta.append("you: "+utext+"\n");
				
				if(utext.contains("hi"))
				{
					botsay("hello there !");
				}
				else
				{
				int decider=(int)(Math.random()*3+1);
				if(decider==1)
				{
					botsay("i didnt get you ..");
				}
				else if(decider==2)
				{
					botsay("Please say it again .");
				}	
				else if(decider==3)
				{
					botsay("???");
				}
					
				}
				
				tf.setText("");
				
				
			}});
		
		ta.setLocation(15,5);
		ta.setSize(560,510);
		this.add(tf); 
		this.add(ta);
	}
	public void botsay(String s)
	{
		ta.append("AI: "+s+"\n");
	}
	public static void main(String []args)
	{
		new ChatBot();
	}
}
