// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burnerThreads;
import java.util.concurrent.ThreadLocalRandom;


public class MemoryThread extends BurnerThread implements Runnable {
	
	private final int PER_THREAD_SIZE;
	private final int COMPONENT_SIZE;
	private final byte[] buffer;

	public MemoryThread(int tOTAL_SIZE, int cOMPONENT_SIZE) {
		super();
		PER_THREAD_SIZE = tOTAL_SIZE;
		COMPONENT_SIZE = cOMPONENT_SIZE;
		buffer = new byte[PER_THREAD_SIZE];
	}

	@Override
	protected boolean doAction() {
		int lineId = ThreadLocalRandom.current().nextInt(PER_THREAD_SIZE / COMPONENT_SIZE);
		buffer[lineId * COMPONENT_SIZE]++;
		Thread.yield();
		return false;
	}

}
