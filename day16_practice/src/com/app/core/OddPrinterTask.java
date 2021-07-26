package com.app.core;

import static java.lang.Thread.sleep;
import java.util.Random;

public class OddPrinterTask implements Runnable{
	private int loopStart, loopEnd;
	private Random r;
	
	public OddPrinterTask(int start, int end) {
		this.loopStart = start;
		this.loopEnd = end;
		r = new Random();
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Inside run method of odd runnable");
			for(int i=this.loopStart; i<=this.loopEnd; i++) {
				if(i % 2 != 0) {
					System.out.println("Odd printer : " + i);
				}
				sleep(r.nextInt(401) + 200);
			}
			System.out.println("Odd runnable excecution over");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
