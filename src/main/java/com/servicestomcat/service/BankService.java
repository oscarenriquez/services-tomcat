package com.servicestomcat.service;

import java.util.List;

import com.servicestomcat.model.Bank;

public interface BankService {

	public Bank createBank (Bank bank);
	
	public Bank getBank (Long bankId);
	
	public Bank updateBank (Bank bank);
	
	public void deleteBank (Long bankId);
	
	public List<Bank> getAllBanks ();
}
