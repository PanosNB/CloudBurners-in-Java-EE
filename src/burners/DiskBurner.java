// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burners;

import cloudBurners.BurnerOptions;
import burnerThreads.DiskThread;

public class DiskBurner extends Burner {

	@Override
	public void setUp(BurnerOptions burnerOptions) {
		tasks = new DiskThread[burnerOptions.nThreads];
		for(int i = 0; i < tasks.length; i++){
			tasks[i] = new DiskThread();
		}
	}

}
