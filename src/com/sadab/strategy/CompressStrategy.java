package com.sadab.strategy;

import com.sadab.components.ICompress;

public class CompressStrategy {
	
	private ICompress icompress;
	
	public void setCompressor(ICompress icompress) {
		this.icompress = icompress;
	}
	
	public void compress(String filename) {
		if (icompress != null) {
			icompress.compress(filename);
		} else {
			System.out.println("Compression strategy not set.");
		}
	}
}
