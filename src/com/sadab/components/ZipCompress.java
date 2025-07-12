package com.sadab.components;

public class ZipCompress implements ICompress{

	@Override
	public void compress(String filename) {
		System.out.println(filename + " Compressing as Zip file");
	}

}
