package com.servicestomcat.service;

import java.util.List;

import com.servicestomcat.model.Bank;

public interface BankService {

	public void createBank (Bank bank);
	
	public Bank getBank (Long bankId);
	
	public void updateBank (Bank bank);
	
	public void deleteBank (Bank bank);
	
	public List<Bank> getAllBanks ();
}
