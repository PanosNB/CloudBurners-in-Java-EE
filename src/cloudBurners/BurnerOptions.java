// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package cloudBurners;

public class BurnerOptions {
	public volatile int nThreads;
	public volatile int totalSize;
	public volatile int componentSize;
	public volatile String url;
	public volatile int port;
	
	public BurnerOptions(int nThreads, int totalSize, int componentSize) {
		this.nThreads = nThreads;
		this.totalSize = totalSize;
		this.componentSize = componentSize;
	}

	public BurnerOptions(int nThreads) {
		this.nThreads = nThreads;
	}

	public BurnerOptions(int nThreads, String url, int port, int componentSize) {
		this.nThreads = nThreads;
		this.port = port;
		this.componentSize = componentSize;
		this.url = url;
	}
}
