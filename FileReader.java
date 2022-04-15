package org.account.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import org.account.model.Transaction;

public class FileReader {

	private static volatile FileReader INSTANCE = null;
	private static final String ACCOUNT_FILE = "D:\\Raghav\\Account\\Account.txt";

	private FileReader() {

	}

	public static FileReader getInstance() {
		if (INSTANCE == null) {
			synchronized (FileReader.class) {
				if (INSTANCE == null) {
					INSTANCE = new FileReader();
				}
			}
		}
		return INSTANCE;
	}

	public List<Transaction> getData() throws IOException {
		Files.lines(Paths.get(ACCOUNT_FILE)).skip(1).map(line -> {
			mapper(line.split(","));			
		});
		return null;
	}

	/*
	 * private Transaction mapper(String[] line) {
	 * 
	 * 
	 * }
	 */

}
