package ui;

import model.CountingPrimeNumbers;
import threads.CountingPrimeNumbersThread;

public class TwoThreadsMain {

	public static void main(String[] args) throws InterruptedException {
		CountingPrimeNumbers cpn1 = new CountingPrimeNumbers(0, 5000000);
		CountingPrimeNumbers cpn2 = new CountingPrimeNumbers(5000000, 10000000);
		CountingPrimeNumbersThread ct1 = new CountingPrimeNumbersThread(cpn1);
		CountingPrimeNumbersThread ct2 = new CountingPrimeNumbersThread(cpn2);
		
		long st = System.currentTimeMillis();
		
		ct1.run();
		ct2.run();
		
		ct1.join();
		ct2.join();
		
		long et = System.currentTimeMillis();
		
		int output= cpn1.getTotal();
		output+= cpn2.getTotal();
		System.out.println("Range: 0 - 10.000.000"+"\nPrime numbers: "+output+"\nTime:"+(et-st));
		
	}
	
}
