package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentModel;
import com.example.demo.repository.PaymentModelRepository;
import com.example.demo.service.PaymentModelService;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentModelService pmSv;
	
	@Autowired 
	PaymentModelRepository pmRepo;
	
	@GetMapping("/getall")
	public List<PaymentModel> getstring() {
		return pmSv.getAll();
	}
	
	@GetMapping("getById/{id}")
	public PaymentModel getById(@PathVariable String id) {
		return pmRepo.getByRefID(id);
	}
//	@PutMapping
	@PostMapping("/save")
	public String save(@RequestBody PaymentModel pm) {
		if(pmSv.save(pm)) {
			return "ok";
		}
		else {
			return "false";
		}
	}
}
