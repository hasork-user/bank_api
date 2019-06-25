package com.sprx.repos;


import java.util.List;


import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.sprx.model.Bank;





public interface BankRepository extends CrudRepository<Bank, Integer>
{
	List<Bank> findByIfsc(String ifsc, Pageable pageable);
	List<Bank> findByIfsc(String ifsc);
	List<Bank> findByNameAndCity(String bank_name,String city, Pageable pageable);
	List<Bank> findByNameAndCity(String bank_name,String city);
	
}
