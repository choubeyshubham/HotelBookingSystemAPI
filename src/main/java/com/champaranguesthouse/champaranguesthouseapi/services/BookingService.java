package com.champaranguesthouse.champaranguesthouseapi.services;



import com.champaranguesthouse.champaranguesthouseapi.dtos.BookingDTO;
import com.champaranguesthouse.champaranguesthouseapi.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}