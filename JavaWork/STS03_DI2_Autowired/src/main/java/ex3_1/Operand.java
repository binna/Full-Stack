package ex3_1;

public class Operand {
	int value;
	
	
	public Operand() {
		System.out.println("Operand() 생성");
	}
	public Operand(int value) {
		super();
		this.value = value;
	}

	
	public final int getValue() {
		return value;
	}
	public final void setValue(int value) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return String.format("[Operand: %d]", value);
	}
	
}