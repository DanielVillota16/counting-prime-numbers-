package ui;

import model.CountingPrimeNumbers;
import threads.CountingPrimeNumbersThread;

public class FiveThreadsMain {

	public static void main(String[] args) throws InterruptedException {
		CountingPrimeNumbers cpn1 = new CountingPrimeNumbers(0, 2000000);
		CountingPrimeNumbers cpn2 = new CountingPrimeNumbers(2000000, 4000000);
		CountingPrimeNumbers cpn3 = new CountingPrimeNumbers(4000000, 6000000);
		CountingPrimeNumbers cpn4 = new CountingPrimeNumbers(6000000, 8000000);
		CountingPrimeNumbers cpn5 = new CountingPrimeNumbers(8000000, 10000000);
		CountingPrimeNumbersThread ct1 = new CountingPrimeNumbersThread(cpn1);
		CountingPrimeNumbersThread ct2 = new CountingPrimeNumbersThread(cpn2);
		CountingPrimeNumbersThread ct3 = new CountingPrimeNumbersThread(cpn3);
		CountingPrimeNumbersThread ct4 = new CountingPrimeNumbersThread(cpn4);
		CountingPrimeNumbersThread ct5 = new CountingPrimeNumbersThread(cpn5);
		
		long st = System.currentTimeMillis();
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();
		ct5.start();
		ct1.join();
		ct2.join();
		ct3.join();
		ct4.join();
		ct5.join();
		long et = System.currentTimeMillis();
		
		int output= cpn1.getTotal();
		output+= cpn2.getTotal();
		output+= cpn3.getTotal();
		output+= cpn4.getTotal();
		output+= cpn5.getTotal();
		System.out.println("Range: 0 - 10.000.000"+"\nPrime numbers: "+output+"\nTime:"+(et-st));

	}
	
}
