// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burners;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import cloudBurners.BurnerOptions;
import burnerThreads.BurnerThread;

public abstract class Burner {
	protected BurnerThread[] tasks;
	private ExecutorService threadPool;
	
	public abstract void setUp(BurnerOptions burnerOptions);
	
	public void startThreads(){
		if(tasks != null){
			
			threadPool = Executors.newFixedThreadPool(tasks.length);
			
			for(int i = 0; i < tasks.length; i++){
				threadPool.execute(tasks[i]);
			}
		}
	}
	
	public void stop(){
		
		threadPool.shutdown();
		threadPool.shutdownNow();
		
		try {
			threadPool.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
