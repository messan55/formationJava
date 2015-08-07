package com.loncoto.factoryproject.data;

import java.io.File;
import java.util.Map;

public abstract class DataImporter {

	public abstract Map<String, String> importData();
	
	public static DataImporter BuildDataImporter(String filename){
		String extension = filename.substring(filename.length() - 3);
		switch (extension) {
		case "xml":
			return new XMLDataImporter(filename);
		}
		return null;
	}
}
