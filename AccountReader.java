package org.account;

import java.io.IOException;

import org.account.util.FileReader;

public class AccountReader {
	

	public static void main(String[] args) {

		try {
					
			FileReader reader = FileReader.getInstance();
			reader.getData();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
