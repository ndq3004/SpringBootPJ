package com.example.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PaymentModel;
@Repository
public interface PaymentModelRepository extends CrudRepository<PaymentModel, UUID> {
	@Query(value="SELECT * FROM payment_model",nativeQuery = true)
	List<PaymentModel> getAll();
	
	@Query(value="select * from payment_model u where u.refID = :refID", nativeQuery = true)
	PaymentModel getByRefID(String refID);
}
