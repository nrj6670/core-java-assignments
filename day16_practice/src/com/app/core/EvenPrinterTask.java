package com.app.core;

import static java.lang.Thread.sleep;
import java.util.Random;

public class EvenPrinterTask implements Runnable {
	private int loopStart, loopEnd;
	private Random rand;
	
	public EvenPrinterTask(int start, int end) {
		this.loopStart = start;
		this.loopEnd = end;
		rand = new Random();  
	}
	
	@Override
	public void run()  {
		try {
			System.out.println("Inside run method of even runnable");
			for(int i=this.loopStart; i<=this.loopEnd; i++) {
				if(i % 2 == 0) {
					System.out.println("Even printer : " + i);
				}
				sleep(rand.nextInt(401) + 100);
			}
			System.out.println("Even runnable execution over");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
