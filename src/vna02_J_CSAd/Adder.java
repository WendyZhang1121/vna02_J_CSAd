package vna02_J_CSAd;

final class Adder { 
	
	private int a; private int b;
    
	public synchronized int getSum() { // Check for overflow		
		return a + b;
	}
	
	public synchronized void setValues(int a, int b) { 
		this.a = a;
		this.b = b;
	} 
	
}
