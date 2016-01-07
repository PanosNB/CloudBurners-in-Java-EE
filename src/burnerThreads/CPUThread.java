// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burnerThreads;

public class CPUThread extends BurnerThread implements Runnable {

	@Override
	protected boolean doAction() {
		int n = 982451653;
		for(long i=2; i<Math.sqrt(n); i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

}
