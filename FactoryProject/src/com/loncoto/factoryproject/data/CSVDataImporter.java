package com.loncoto.factoryproject.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CSVDataImporter extends DataImporter {

	private File csvFile;
	
	public CSVDataImporter(String filename){
		csvFile = new File(filename);
	}
	
	public Map<String, String> importData() {
		HashMap<String, String> data = new HashMap<String, String>();	
		try {
			Scanner reader;
			reader = new Scanner(csvFile);
			while (reader.hasNext()) {
				String champs[] = reader.nextLine().split(";");
				data.put(champs[0], champs[1]);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}

}
