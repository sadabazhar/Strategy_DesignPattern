package com.sadab.main;

import com.sadab.components.ICompress;
import com.sadab.compressorfactory.CompressorFactory;
import com.sadab.strategy.CompressStrategy;

public class DesignTest {
	
	public static void main(String[] args) {
		
		CompressorFactory factory = new CompressorFactory();
		CompressStrategy strategy = new CompressStrategy();

		ICompress zipCompressor = factory.chooseCompressor("zip");
		strategy.setCompressor(zipCompressor);
		strategy.compress("test.java");

		ICompress rarCompressor = factory.chooseCompressor("rar");
		strategy.setCompressor(rarCompressor);
		strategy.compress("data.txt");

		ICompress unknown = factory.chooseCompressor("7z");
		strategy.setCompressor(unknown);
		strategy.compress("report.pdf");
	}
}
