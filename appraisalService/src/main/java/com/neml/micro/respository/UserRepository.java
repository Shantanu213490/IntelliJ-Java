package com.neml.micro.respository;

import com.neml.micro.model.AppraisalModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<AppraisalModel,String> {
}
