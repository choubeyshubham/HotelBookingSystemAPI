package com.champaranguesthouse.champaranguesthouseapi.repositories;



import com.champaranguesthouse.champaranguesthouseapi.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}