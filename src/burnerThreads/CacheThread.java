// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burnerThreads;

import java.util.concurrent.ThreadLocalRandom;


public class CacheThread extends BurnerThread {

	private final int TOTAL_SIZE;
	private final int COMPONENT_SIZE;
	private final byte[] buffer;
	
	public CacheThread(int tOTAL_SIZE, int cOMPONENT_SIZE, byte[] buffer) {
		TOTAL_SIZE = tOTAL_SIZE;
		COMPONENT_SIZE = cOMPONENT_SIZE;
		this.buffer = buffer;
	}

	@Override
	protected boolean doAction() {
		int lineId = ThreadLocalRandom.current().nextInt(TOTAL_SIZE / COMPONENT_SIZE);
		buffer[lineId * COMPONENT_SIZE]++;
		Thread.yield();
		return false;
	}

}
