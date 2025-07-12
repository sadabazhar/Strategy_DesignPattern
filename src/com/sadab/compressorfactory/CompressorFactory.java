package com.sadab.compressorfactory;

import com.sadab.components.ICompress;
import com.sadab.components.RarCompress;
import com.sadab.components.ZipCompress;

public class CompressorFactory {
	
	ICompress icompress;
	
	public ICompress chooseCompressor(String compressorType) {
		
		if(compressorType.equalsIgnoreCase("Zip")) {
			this.icompress = new ZipCompress();
			return icompress;
		}else if(compressorType.equalsIgnoreCase("Rar")) {
			this.icompress = new RarCompress();
			return icompress;
		}else {
			System.out.println("Wrong Selction");
			return null;
		}
		
	}
}
