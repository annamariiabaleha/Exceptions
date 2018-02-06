
public class Methods {
	private int a;
	private int b;
	

	public Methods() {
		
	}

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int addTwoNumbers (int a, int b) {
		return a + b;
	}
	
	public int differenceOfTwoNumbers (int diminished, int subtrahend) {
		return diminished - subtrahend;
	}
	
	public int productOfTwoNumbers (int multiplier1, int multiplier2 ) {
		return multiplier1*multiplier2;
	}
	
	public int fractionOfTwoNumbers (int divided, int divider) {
		return divided / divider;
	}
}
