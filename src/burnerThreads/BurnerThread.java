// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burnerThreads;
public abstract class BurnerThread implements Runnable {

	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()){
			doAction();
		}
	}

	protected abstract boolean doAction();
}
