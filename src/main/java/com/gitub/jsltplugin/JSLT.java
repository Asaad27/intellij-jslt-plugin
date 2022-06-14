package com.gitub.jsltplugin;

import com.intellij.lang.Language;

public class JSLT extends Language {

	private static JSLT INSTANCE = null;

	private JSLT(){
		super("Simple");
	}

	public static JSLT getInstance(){
		if (INSTANCE == null){
			INSTANCE = new JSLT();
		}
		return INSTANCE;
	}
}
