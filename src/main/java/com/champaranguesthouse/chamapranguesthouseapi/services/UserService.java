package com.champaranguesthouse.chamapranguesthouseapi.services;

import com.champaranguesthouse.chamapranguesthouseapi.dtos.LoginRequest;
import com.champaranguesthouse.chamapranguesthouseapi.dtos.RegistrationRequest;
import com.champaranguesthouse.chamapranguesthouseapi.dtos.Response;
import com.champaranguesthouse.chamapranguesthouseapi.dtos.UserDTO;
import com.champaranguesthouse.chamapranguesthouseapi.entities.User;

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