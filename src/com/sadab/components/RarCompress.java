package com.sadab.components;

public class RarCompress implements ICompress {

	@Override
	public void compress(String filename) {
		System.out.println(filename + " Compressing as Rar file");
	}
}
