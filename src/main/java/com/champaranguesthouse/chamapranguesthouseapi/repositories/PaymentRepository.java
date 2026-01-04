package com.champaranguesthouse.chamapranguesthouseapi.repositories;

import com.champaranguesthouse.chamapranguesthouseapi.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {
}
