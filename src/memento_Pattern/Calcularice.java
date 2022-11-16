package memento_Pattern;

public class Calcularice {
	
	private double a, b, result;
	
	public Memento mementoA = new Memento();//t-1
	public Memento mementoB = new Memento();//t
	
	public double somme(double a , double b){
		mementoA.setA(mementoB.getA());
		mementoA.setB(mementoB.getB());
		mementoA.setOperation(mementoB.getOperation());
		this.a=a;
		this.b=b;
		mementoB.setA(a);
		mementoB.setB(b);
		mementoB.setOperation("somme");
		return (this.result=a+b);
	}
	
	public double produit(double a , double b){
		//mementoA=mementoB;
		mementoA.setA(mementoB.getA());
		mementoA.setB(mementoB.getB());
		mementoA.setOperation(mementoB.getOperation());
		this.a=a;
		this.b=b;
		mementoB.setA(a);
		mementoB.setB(b);
		mementoB.setOperation("produit");
		return (this.result=a*b);
	}
	public double division(double a , double b){
		mementoA.setA(mementoB.getA());
		mementoA.setB(mementoB.getB());
		mementoA.setOperation(mementoB.getOperation());
		this.a=a;
		this.b=b;
		mementoB.setA(a);
		mementoB.setB(b);
		mementoB.setOperation("division");
		return (this.result=a/b);
	}
	public double soustraction(double a , double b){
		mementoA.setA(mementoB.getA());
		mementoA.setB(mementoB.getB());
		mementoA.setOperation(mementoB.getOperation());
		this.a=a;
		this.b=b;
		mementoB.setA(a);
		mementoB.setB(b);
		mementoB.setOperation("soustraction");
		return (this.result=a-b);
	}

	@Override
	public String toString() {
		return "Calcularice [a=" + a + ", b=" + b + ", result=" + result + ", mementoA=" + mementoA + ", mementoB="
				+ mementoB + "]";
	}
	
	
}
