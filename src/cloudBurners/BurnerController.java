// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package cloudBurners;

import burners.CacheBurner;
import burners.MemoryBurner;
import burners.Burner;
import burners.CPUBurner;
import burners.DiskBurner;
import burners.NetBurner;

public class BurnerController {
	private static boolean[] up = new boolean[5];
	private static Burner[] burners = new Burner[5];
	
	public static final BurnerOptions[] burnerOptions = new BurnerOptions[5];
	
	static{
		burners[0] = new CPUBurner();
		burners[1] = new CacheBurner(); //Cache
		burners[2] = new MemoryBurner(); //Memory
		burners[3] = new DiskBurner();
		burners[4] = new NetBurner();
		
		//CPU
		burnerOptions[0] = new BurnerOptions(Runtime.getRuntime().availableProcessors() + 1);
		
		//Cache
		burnerOptions[1] = new BurnerOptions(Runtime.getRuntime().availableProcessors() + 1, 32 * (1<<20), 64);
		
		//Memory
		burnerOptions[2] = new BurnerOptions(2, (int) ((1<<29)*3/4096 - (1<<14))*4096, 4096);
		
		//Disk
		burnerOptions[3] = new BurnerOptions(1);
		
		//Network
		burnerOptions[4] = new BurnerOptions(1, "192.168.1.10", 5555, 2048);
	}
	
	public synchronized static boolean start(int i){
		if(up[i]){
			return false;
		} else {
			burners[i].setUp(burnerOptions[i]);
			burners[i].startThreads();
			up[i] = true;
			return true;
		}
	}
	
	public synchronized static boolean stop(int i){
		if(up[i]){
			up[i] = false;
			burners[i].stop();
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isUp(int i){
		return up[i];
	}
	
	public synchronized static void toggle(int i){
		if(up[i]){
			stop(i);
		} else {
			start(i);
		}
	}
}
