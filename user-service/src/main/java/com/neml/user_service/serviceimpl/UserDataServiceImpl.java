package com.neml.user_service.serviceimpl;

import com.neml.user_service.exceptions.ResourceNotFoundException;
import com.neml.user_service.model.UserDataResponse;
import com.neml.user_service.model.UserModel;
import com.neml.user_service.repository.UserDataRepository;
import com.neml.user_service.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public UserDataResponse saveUserData(UserModel userModel) {
        UserDataResponse response = new UserDataResponse();
        String randomUserId= UUID.randomUUID().toString();
        userModel.setUserId(randomUserId);
        Optional<UserModel> optional = Optional.of(userDataRepository.save(userModel));
        if (optional.isPresent()) {
            UserModel savedUserModel = optional.get();
            response.setErrorCode("200");
            response.setMessage("User has stored successfully");
            return response;
        } else {
            response.setErrorCode("201");
            response.setMessage("User has not stored successfully");
            return response;
        }
    }

    @Override
    public UserModel getUserDataByUserId(String userId) {

        return userDataRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("UserId : "+ userId+ " is not found on server!!!"));

    }

    @Override
    public List<UserModel> getAllUserData() {
        return userDataRepository.findAll();
    }
}
