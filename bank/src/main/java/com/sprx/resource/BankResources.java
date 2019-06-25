package com.sprx.resource;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprx.model.Bank;
import com.sprx.repos.BankRepository;



@RestController
public class BankResources 
{
	
	@Autowired
	BankRepository bank;
	
	@GetMapping("/")
	public void check()
	{
		System.out.println("hello");
	}
	
	
	@GetMapping("banks")
	public List<Bank> getBanks()
	{
		List<Bank> banks = (List<Bank>) bank.findAll();
		return banks;
	}
	
	@GetMapping(value="ifsc")
	public List<Bank> getByIfsc(@RequestParam("code") String ifsc, @RequestParam(value="limit", required=false) Integer limit)
	{
		if(limit == null)
		{
			List<Bank> banks = (List<Bank>) bank.findByIfsc(ifsc);
			return banks;
		}
		else
		{
			List<Bank> banks = (List<Bank>) bank.findByIfsc(ifsc, PageRequest.of(0, limit));
			return banks;
		}
	}
	
	
	@GetMapping(value=("bankinfo")) 
	public List<Bank> getInfo(@RequestParam("bank_name") String bank_name,@RequestParam("city") String city, @RequestParam(value="limit", required=false) Integer limit)
	{
		if(limit == null)
		{
			List<Bank> banks = (List<Bank>) bank.findByNameAndCity(bank_name, city);
			System.out.println(bank_name);
			return banks;
		}
		else 
		{
			List<Bank> banks = (List<Bank>) bank.findByNameAndCity(bank_name, city, PageRequest.of(0, limit));
			System.out.println(bank_name);
			return banks;
		}
	}
	
	
	
	
}








