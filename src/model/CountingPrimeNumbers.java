package model;

public class CountingPrimeNumbers {

	private int start;
	private int end;
	private int total;
	
	public CountingPrimeNumbers(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void count() {
		if(start < 2) {
			start = 2;
		}
		for(int i = start; i < end; i++) {
			boolean notPrime = false;
			int limit = (int) Math.pow(i,0.5);
			for(int j = 2; j < limit+1&& !notPrime; j++) {
				if(i%j == 0) {
					notPrime = true;
				}
			}
			if(!notPrime) {
				total++;
			}
		}
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	public int getTotal() {
		return total;
	}
	
}
