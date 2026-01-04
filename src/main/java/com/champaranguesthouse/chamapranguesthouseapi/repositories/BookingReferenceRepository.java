package com.champaranguesthouse.chamapranguesthouseapi.repositories;

import com.champaranguesthouse.chamapranguesthouseapi.entities.BookingReference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingReferenceRepository extends JpaRepository<BookingReference,Long> {


    Optional<BookingReference> findByBookingReferenceNo(Long bookingReferenceNo);


}
