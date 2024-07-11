package pack;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Mycalc {

	private JFrame frame;
	private JTextField textField;
	double First;
	double Second;
	String operations="";
	String answers="";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mycalc window = new Mycalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mycalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setBounds(100, 100, 490, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 436, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(12, 144, 83, 47);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton zerobutton = new JButton("00");
		zerobutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+zerobutton.getText();
				textField.setText(number);
			}
		});
		 zerobutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		 zerobutton.setBounds(118, 143, 85, 48);
		frame.getContentPane().add( zerobutton);
		
		JButton backspace = new JButton("C");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(str.length()-1);
				backspace=str.toString();
				textField.setText(backspace);
			}
		});
		backspace.setFont(new Font("Tahoma", Font.BOLD, 16));
		backspace.setBounds(233, 143, 85, 48);
		frame.getContentPane().add(backspace);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 16));
		plus.setBounds(363, 143, 85, 48);
		frame.getContentPane().add(plus);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+one.getText();
				textField.setText(number);
			}
		});
		one.setFont(new Font("Tahoma", Font.BOLD, 16));
		one.setBounds(12, 204, 85, 48);
		frame.getContentPane().add(one);
		
		JButton Two = new JButton("2");
		Two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Two.getText();
				textField.setText(number);
			}
		});
		Two.setFont(new Font("Tahoma", Font.BOLD, 16));
		Two.setBounds(118, 204, 85, 48);
		frame.getContentPane().add(Two);
		
		JButton Three = new JButton("3");
		Three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Three.getText();
				textField.setText(number);
			}
		});
		Three.setFont(new Font("Tahoma", Font.BOLD, 16));
		Three.setBounds(233, 204, 85, 48);
		frame.getContentPane().add(Three);
		
		JButton Minus = new JButton("-");
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		Minus.setFont(new Font("Tahoma", Font.BOLD, 16));
		Minus.setBounds(363, 204, 85, 48);
		frame.getContentPane().add(Minus);
		
		JButton Four = new JButton("4");
		Four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Four.getText();
				textField.setText(number);
			}
		});
		Four.setFont(new Font("Tahoma", Font.BOLD, 16));
		Four.setBounds(12, 265, 85, 48);
		frame.getContentPane().add(Four);
		
		JButton Five = new JButton("5");
		Five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Five.getText();
				textField.setText(number);
			}
		});
		Five.setFont(new Font("Tahoma", Font.BOLD, 16));
		Five.setBounds(118, 265, 85, 48);
		frame.getContentPane().add(Five);
		
		JButton Six = new JButton("6");
		Six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Six.getText();
				textField.setText(number);
			}
		});
		Six.setFont(new Font("Tahoma", Font.BOLD, 16));
		Six.setBounds(233, 265, 85, 48);
		frame.getContentPane().add(Six);
		
		JButton Multiply = new JButton("*");
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		Multiply.setFont(new Font("Tahoma", Font.BOLD, 16));
		Multiply.setBounds(363, 265, 85, 48);
		frame.getContentPane().add(Multiply);
		
		JButton Seven = new JButton("7");
		Seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Seven.getText();
				textField.setText(number);
			}
		});
		Seven.setFont(new Font("Tahoma", Font.BOLD, 16));
		Seven.setBounds(12, 329, 85, 42);
		frame.getContentPane().add(Seven);
		
		JButton Eight = new JButton("8");
		Eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Eight.getText();
				textField.setText(number);
			}
		});
		Eight.setFont(new Font("Tahoma", Font.BOLD, 16));
		Eight.setBounds(118, 329, 85, 42);
		frame.getContentPane().add(Eight);
		
		JButton Nine = new JButton("9");
		Nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Nine.getText();
				textField.setText(number);
			}
		});
		Nine.setFont(new Font("Tahoma", Font.BOLD, 16));
		Nine.setBounds(233, 329, 85, 42);
		frame.getContentPane().add(Nine);
		
		JButton Division = new JButton("/");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		Division.setFont(new Font("Tahoma", Font.BOLD, 16));
		Division.setBounds(363, 329, 85, 42);
		frame.getContentPane().add(Division);
		
		JButton Dot = new JButton(".");
		Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Dot.getText();
				textField.setText(number);
			}
		});
		Dot.setFont(new Font("Tahoma", Font.BOLD, 16));
		Dot.setBounds(12, 384, 85, 48);
		frame.getContentPane().add(Dot);
		
		JButton Zero = new JButton("0");
		Zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Zero.getText();
				textField.setText(number);
			}
		});
		Zero.setFont(new Font("Tahoma", Font.BOLD, 16));
		Zero.setBounds(118, 384, 85, 48);
		frame.getContentPane().add(Zero);
		
		JButton equalbutton = new JButton("=");
		equalbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Result ;
				Second=Double.parseDouble(textField.getText());
				if(operations=="+") {
					Result=First+Second;
					answers=String.valueOf(Result);
					textField.setText(answers);
				}
				if(operations=="-") {
					Result=First-Second;
					answers=String.valueOf(Result);
					textField.setText(answers);
				}
				if(operations=="*") {
					Result=First*Second;
					answers=String.valueOf(Result);
					textField.setText(answers);
				}
				if(operations=="/") {
					Result=First/Second;
					answers=String.valueOf(Result);
					textField.setText(answers);
				}
				if(operations=="%") {
					Result=First%Second;
					answers=String.valueOf(Result);
					textField.setText(answers);
				}
				
			}
		});
		equalbutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		equalbutton.setBounds(233, 384, 85, 48);
		frame.getContentPane().add(equalbutton);
		
		JButton percentbutton = new JButton("\u221A");
		percentbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double r=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+r);
//				First=Double.parseDouble(textField.getText());
//				textField.setText("");
//				operations="%";
			}
		});
		percentbutton.setFont(new Font("Tahoma", Font.BOLD, 16));
		percentbutton.setBounds(363, 384, 85, 48);
		frame.getContentPane().add(percentbutton);
		
//		JButton button = new JButton("+/-");
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				double exp=Double.parseDouble(String.valueOf(textField.getText()));
//				exp=exp*(-1);
//				textField.setText(String.valueOf(exp));
//			}
//		});
//		button.setFont(new Font("Tahoma", Font.BOLD, 16));
//		button.setBounds(12, 87, 85, 48);
//		frame.getContentPane().add(button);
//		
//		JButton button_1 = new JButton("e");
//		button_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				double exponent=Math.pow(Double.parseDouble(textField.getText()), First);
//				textField.setText("");
//				textField.setText(textField.getText()+exponent);
//			}
//		});
//		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
//		button_1.setBounds(118, 87, 85, 48);
//		frame.getContentPane().add(button_1);
//		
//		JButton button_2 = new JButton("00");
//		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
//		button_2.setBounds(233, 87, 85, 48);
//		frame.getContentPane().add(button_2);
	
	}
	}


