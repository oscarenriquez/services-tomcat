package com.servicestomcat;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

import com.servicestomcat.model.Bank;
import com.servicestomcat.service.BankService;
import com.servicestomcat.service.impl.BankServiceImpl;

@Path("/banks")
public class BankResource {

	private static final Logger logger = Logger.getLogger(BankResource.class);
	private BankService bankService = new BankServiceImpl();

	@GET	
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getAllBanks() {
		logger.info("getAllBanks");
		return Response.ok().entity(new GenericEntity<List<Bank>>(bankService.getAllBanks()) {}).build();
	}
	
	@GET
	@Path("/{bankId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getBank(@PathParam("bankId") Long bankId) {
		if(bankId == null){
			return Response.status(Status.BAD_REQUEST).build();
		}
		Bank bank = bankService.getBank(bankId);
		if(bank == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok().entity(bank).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createBank(Bank bank) {
		if(bank == null || bank.getBankId() == null) {
			return Response.status(Status.BAD_REQUEST).build();
		}
		return Response.ok().entity(bankService.createBank(bank)).build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response updateBank(Bank bank) {
		if(bank == null || bank.getBankId() == null) {
			return Response.status(Status.BAD_REQUEST).build();
		}
		return Response.ok().entity(bankService.updateBank(bank)).build();
	}

	@DELETE
	@Path("/{bankId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response deleteBank(@PathParam("bankId") Long bankId) {
		if(bankId == null) {
			return Response.status(Status.BAD_REQUEST).build();
		}
		bankService.deleteBank(bankId);
		return Response.ok().build();
	}
}
