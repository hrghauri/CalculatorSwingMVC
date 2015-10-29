// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;



public class CalculatorView extends JFrame{
	
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
 	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_0;
	private JButton button_div;
	private JButton button_mul;
	private JButton button_plus;
	private JButton button_minus;
	private JButton button_equals;
	private JTextField screen;
	private JButton btnClear;

	
	CalculatorView(){

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(286, 319);
		getContentPane().setLayout(null);
		
		button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_7.getText());
			}
		});
		button_7.setBounds(10, 89, 60, 44);
		getContentPane().add(button_7);
		
		button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_8.getText());
			}
		});
		button_8.setBounds(72, 89, 60, 44);
		getContentPane().add(button_8);
		
		button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_9.getText());
			}
		});
		button_9.setBounds(132, 89, 60, 44);
		getContentPane().add(button_9);
		
		button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_4.getText());
			}
		});
		button_4.setBounds(10, 134, 60, 44);
		getContentPane().add(button_4);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_5.getText());
			}
		});
		button_5.setBounds(72, 134, 60, 44);
		getContentPane().add(button_5);
		
		button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_6.getText());
			}
		});
		button_6.setBounds(132, 134, 60, 44);
		getContentPane().add(button_6);
		
		button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_1.getText());
			}
		});
		button_1.setBounds(10, 177, 60, 44);
		getContentPane().add(button_1);
		
		button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_2.getText());
			}
		});
		button_2.setBounds(72, 177, 60, 44);
		getContentPane().add(button_2);
		
		button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_3.getText());
			}
		});
		button_3.setBounds(132, 177, 60, 44);
		getContentPane().add(button_3);
		
		button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText() + button_0.getText());
			}
		});
		button_0.setBounds(72, 225, 60, 44);
		getContentPane().add(button_0);
		
		button_div = new JButton("/");
		button_div.setBounds(194, 88, 60, 44);
		getContentPane().add(button_div);
		
		button_mul = new JButton("x");
		button_mul.setBounds(194, 133, 60, 45);
		getContentPane().add(button_mul);
		
		button_minus = new JButton("-");
		button_minus.setBounds(194, 177, 60, 45);
		getContentPane().add(button_minus);
		
		button_plus = new JButton("+");
		button_plus.setBounds(194, 225, 60, 45);
		getContentPane().add(button_plus);
		
		button_equals = new JButton("=");
		button_equals.setBounds(132, 225, 60, 45);
		getContentPane().add(button_equals);
		
		btnClear = new JButton("Clear");
		btnClear.setBounds(10, 45, 125, 44);
		getContentPane().add(btnClear);
		
		screen = new JTextField();
		screen.setBounds(10, 11, 244, 33);
		getContentPane().add(screen);
		screen.setColumns(10);
		}
	
		public void setScreen(int numbers){
			screen.setText(Integer.toString(numbers));
		}
		
		public void clearScreen(){
			screen.setText("");
		}
		
		public int getScreenNumb(){
			return  Integer.parseInt(screen.getText());
		}
		

		public void addCalcOperationListener(ActionListener listenForCalcOperationButton){
			button_plus.addActionListener(listenForCalcOperationButton);
			button_minus.addActionListener(listenForCalcOperationButton);
			button_mul.addActionListener(listenForCalcOperationButton);
			button_div.addActionListener(listenForCalcOperationButton);
		}
		
		public void addEqualButtonListener(ActionListener listenForEqualButton){
			button_equals.addActionListener(listenForEqualButton);
		}
		
		public void addClearbuttonListener(ActionListener listenforClearButton){
			btnClear.addActionListener(listenforClearButton);
		}
	
	
}