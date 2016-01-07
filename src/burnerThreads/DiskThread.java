// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burnerThreads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class DiskThread extends BurnerThread implements Runnable {

	@Override
	protected boolean doAction() {
		String file = Thread.currentThread().getId() + "dst.test";
		FileOutputStream out;
		try {
			out = new FileOutputStream(file);

			out.write(ThreadLocalRandom.current().nextInt());

			out.close();
			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

}
