// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.

package burnerThreads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class NetThread extends BurnerThread {
	
	private final String url;
	private final int port;
	private String msg;

	public NetThread(String url, int port, int componentSize) {
		this.url = url;
		this.port = port;
		for(int i = 0; i < componentSize/2; i++){//chars are 2-bytes long
			msg += (char)i;
		}
	}

	@Override
	protected boolean doAction() {
		Socket client;
		try {
			client = new Socket(url, port);
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
					
			while(!Thread.currentThread().isInterrupted()){
				out.writeUTF(msg);
			}
			
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
