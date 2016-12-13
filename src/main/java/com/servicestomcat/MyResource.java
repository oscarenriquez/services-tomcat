package com.servicestomcat;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.servicestomcat.model.Bank;
import com.servicestomcat.service.BankService;
import com.servicestomcat.service.impl.BankServiceImpl;


@Path("/bank")
public class MyResource {
   
	private BankService bankService = new BankServiceImpl();
	
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Bank> getAllBanks() {
        return bankService.getAllBanks();
    }
}
