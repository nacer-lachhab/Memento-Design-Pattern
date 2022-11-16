package memento_Pattern;

public class Memento {

	private double a, b;
	private String operation;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	@Override
	public String toString() {
		return "Memento [a=" + a + ", b=" + b + ", operation=" + operation + "]";
	}
	
}
