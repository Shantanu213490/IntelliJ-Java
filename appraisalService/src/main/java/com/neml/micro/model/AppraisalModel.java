package com.neml.micro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "appraisal_str")
public class AppraisalModel {

    @Id
    private String userId;
    private String username;
    private String designation;
    private String about;
    private String yearOfJoining;

}
