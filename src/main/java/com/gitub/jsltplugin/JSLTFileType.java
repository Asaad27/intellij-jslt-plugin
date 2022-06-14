package com.gitub.jsltplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JSLTFileType extends LanguageFileType {

	protected JSLTFileType() {
		super(JSLT.getInstance());
	}

	@Override
	public @NonNls @NotNull String getName() {
		return "JSLT";
	}

	@Override
	public  @NotNull String getDescription() {
		return "JSON Query and transformation language";
	}

	@Override
	public @NotNull String getDefaultExtension() {
		return "jslt";
	}

	@Override
	public @Nullable Icon getIcon() {
		return JSLTIcon.FILE;
	}
}
