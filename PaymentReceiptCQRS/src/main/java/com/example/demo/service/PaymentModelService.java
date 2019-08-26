package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PaymentModel;
import com.example.demo.repository.PaymentModelRepository;

@Service
public class PaymentModelService {
	
	@Autowired
	PaymentModelRepository pmRepo;
	
	public List<PaymentModel> getAll(){
		List<PaymentModel> list = new ArrayList<>();
		try {
			list = pmRepo.getAll();	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
		
	}
	public boolean save(PaymentModel pm) {
		try{
			pmRepo.save(pm);
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
