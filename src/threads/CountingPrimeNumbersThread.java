package threads;

import model.CountingPrimeNumbers;

public class CountingPrimeNumbersThread extends Thread{

	private CountingPrimeNumbers c;
	
	public CountingPrimeNumbersThread(CountingPrimeNumbers c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		c.count();
	}
	
}
