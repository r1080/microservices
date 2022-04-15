package org.account.task;

import java.util.List;
import java.util.concurrent.Callable;

import org.account.model.Transaction;

public class RecurringDebit implements Callable<List<Transaction>>{

	@Override
	public List<Transaction> call() throws Exception {
		return null;
	}
	
}
