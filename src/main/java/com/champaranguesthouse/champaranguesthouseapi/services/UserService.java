package com.champaranguesthouse.champaranguesthouseapi.services;


import com.champaranguesthouse.champaranguesthouseapi.dtos.LoginRequest;
import com.champaranguesthouse.champaranguesthouseapi.dtos.RegistrationRequest;
import com.champaranguesthouse.champaranguesthouseapi.dtos.Response;
import com.champaranguesthouse.champaranguesthouseapi.dtos.UserDTO;
import com.champaranguesthouse.champaranguesthouseapi.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}