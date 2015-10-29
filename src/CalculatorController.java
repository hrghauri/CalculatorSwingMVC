import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	private int firstNumber;
	private int secondNumber;
	//private  ArrayList<Integer> results;
	//private boolean cleared;
	private String operation;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		firstNumber = 0;
		secondNumber = 0;
		//cleared = true;
		//results = new ArrayList<Integer>();
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalcOperationListener(new CalculateOperationListener());
		this.theView.addEqualButtonListener(new EqualButtonListener());
		this.theView.addClearbuttonListener(new ClearButtonListener());
	}
	
	private class CalculateOperationListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			try{
			firstNumber = theView.getScreenNumb();
			JButton pressed  = (JButton) e.getSource();
			operation =  pressed.getText();
			theView.clearScreen();
			}catch(Exception e1){
			}
		}
	}
	
	
	private class EqualButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			try{
			secondNumber = theView.getScreenNumb();
			theModel.setNumbers(firstNumber, secondNumber);
			theModel.setOperation(operation);
			theModel.applyOperation();
			int result = theModel.getCalculatedValue();
			//results.add(result);
			theView.setScreen(result);
			}catch(Exception e1){
			}
		}
	}
	
	private class ClearButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			theView.clearScreen();
			firstNumber = 0;
			secondNumber = 0;
			//results.clear();
			//cleared = true;
			operation = null;
		}
	}
	

	

	
}