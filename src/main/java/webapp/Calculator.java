package webapp;

public class Calculator {
	private double memory;
	
	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double addition(double firstNum, double secondNum) {
		return firstNum + secondNum;
	}

}
