package com.tns.cm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class CustomerService {
	
	
	@Autowired
	private CustomerRepository repo;

	
	public List<Customer> showAll(){
		return repo.findAll();
}

	public Customer get(Integer id) {
		return repo.findById(id) .get();	
		}

	public void save(Customer customer) {
		repo.save(customer);
	}
	
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

