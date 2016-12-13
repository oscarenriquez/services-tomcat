package com.servicestomcat.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.servicestomcat.model.Bank;
import com.servicestomcat.service.BankService;

public class BankServiceImpl implements BankService {

	@Override
	public void createBank(Bank bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bank getBank(Long bankId) {		
		return new Bank(1L, "Scotiabank", "New York, US", "Oscar Enriquez", null);
	}

	@Override
	public void updateBank(Bank bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBank(Bank bank) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bank> getAllBanks() {
		List<Bank> list = new ArrayList<>();
		list.add(new Bank(1L, "Scotiabank", "New York, US", "Oscar Enriquez", null));
		list.add(new Bank(2L, "Citybank", "Boston, US", "Carlos Escobar", null));
		list.add(new Bank(3L, "GlobalBank", "London, US", "Andres De Leon", null));
		return list;
	}

}
