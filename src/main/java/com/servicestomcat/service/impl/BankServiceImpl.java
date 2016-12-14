package com.servicestomcat.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.servicestomcat.model.Bank;
import com.servicestomcat.service.BankService;

public class BankServiceImpl implements BankService {

	public static Map<Long, Bank> repository;
	
	public BankServiceImpl() {
		if(repository == null) {
			repository = new HashMap<>();
		}
	}
	
	@Override
	public Bank createBank(Bank bank) {
		repository.put(bank.getBankId(), bank);
		return repository.get(bank.getBankId());
	}

	@Override
	public Bank getBank(Long bankId) {		
		return repository.get(bankId);
	}

	@Override
	public Bank updateBank(Bank bank) {
		if(repository.keySet().contains(bank.getBankId())) {
			repository.put(bank.getBankId(), bank);
			return repository.get(bank.getBankId());
		}
		
		return null;
	}

	@Override
	public void deleteBank(Long bankId) {		
		repository.remove(bankId);
	}

	@Override
	public List<Bank> getAllBanks() {
		List<Bank> list = new ArrayList<>(repository.values());		
		return list;
	}

}
