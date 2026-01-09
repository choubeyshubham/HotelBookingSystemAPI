package com.champaranguesthouse.chamapranguesthouseapi.services;

import com.champaranguesthouse.chamapranguesthouseapi.dtos.BookingDTO;
import com.champaranguesthouse.chamapranguesthouseapi.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}