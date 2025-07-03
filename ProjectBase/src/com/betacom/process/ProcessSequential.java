package com.betacom.process;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ProcessSequential {

	public boolean execute() {
		String filePath = "C:\\Users\\andre\\Desktop\\Java Academy\\git\\ProjectBase\\src\\test.txt";
		String filePath1 = "C:\\Users\\andre\\Desktop\\Java Academy\\git\\ProjectBase\\src\\test.txt";

		List<String> r = readRecord(filePath);
		for (String i : r) {
			System.out.println(i);
		}

		List<String> records = new ArrayList<String>();
		records.add("Record 1");
		records.add("Record 2");
		records.add("Record 3");
		records.add("Record 4");
		records.add("Record 5");
		records.add("Record 6");
		records.add("Record 7");
		records.add("Record 8");
		records.add("Record 9");

		System.out.println("Redords write: " + writeFile(filePath1, records, false));
		return true;
	}

	/*
	 * Read sequential file
	 */
	private List<String> readRecord(String path) {
		List<String> r = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();

			while (line != null) {
				r.add(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error found: " + e.getMessage());
		}
		return r;
	}

	/*
	 * write file
	 */
	private int writeFile(String path, List<String> records) {
		int num = 0;
		;
		File f = new File(path);

		if (f.exists()) {
			System.out.println("File " + path + " exist.");
			f.delete();
		}

		FileWriter o = null;
		try {

			o = new FileWriter(f);
			for(String rec : records) {
				o.write(rec + "\n");
				
				num++;
			}
			o.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return num;
	}
	
	/*
	 * write sequential file using BufferedWritter
	 * 		mode = true -> extend file
	 * 		mode = false -> replace file
	 */

	
	private int writeFile(String path, List<String> records, boolean mode) {
		int num = 0 ;
		BufferedWriter o = null;
		try {
			FileWriter f = new FileWriter(path, mode);
			o = new BufferedWriter(f);
			
			for(String rec:records) {
				o.write(rec);
				o.newLine();
				num++;
			}
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
}
