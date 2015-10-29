public class CalculatorModel {


	private int firstNumber, secondNumber, calculatedValue;
	private String operation;
	
	public void setNumbers(int firstNumber, int secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void setOperation(String operation){
		this.operation = operation;
	}
	
	public void applyOperation(){
		 switch (operation){
         case "+":
        	 calculatedValue = firstNumber + secondNumber;
             break;
         case "-":
             calculatedValue = firstNumber - secondNumber;
             break;
         case "x":
             calculatedValue = firstNumber * secondNumber;
             break;
         case "/":
        	 calculatedValue = firstNumber / secondNumber;
        	 break;
		 	}
	}
		 
	public int getCalculatedValue(){
		return calculatedValue;
	}
	
}