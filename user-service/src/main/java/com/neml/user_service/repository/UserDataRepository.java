package com.neml.user_service.repository;

import com.neml.user_service.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserModel,String> {
}
