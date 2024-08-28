package com.neml.user_service.service;

import com.neml.user_service.model.UserDataResponse;
import com.neml.user_service.model.UserModel;

import java.util.List;

public interface UserDataService {

   public UserDataResponse saveUserData(UserModel userModel);

    public UserModel getUserDataByUserId(String userId);

    public List<UserModel> getAllUserData();
}
