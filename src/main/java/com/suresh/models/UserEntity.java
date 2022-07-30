package com.suresh.models;

import java.time.LocalDate;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_DTLS")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	@Column(name = "USER_FIRST_NAME")
	private String firstName;

	@Column(name = "USER_LAST_NAME")
	private String lastName;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;
	
	@Column(name = "USER_PHNO")
	private Integer userPhno;
	
	@Column(name = "USER_DOB")
	private LocalDate userDob;
	
	@Column(name = "USER_GENDER")
	private String userGender;
	
	@Column(name = "USER_COUNTRY")
	private Integer userCountry;
	
	@Column(name = "USER_STATE")
	private Integer userState;
	
	@Column(name = "USER_CITY")
	private Integer userCity;
	
	@Column(name = "USER_PWD")
	private String userPassword;
	
	@Column(name = "USER_ACC_STATUS")
	private String userAccountStatus;
	
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;
	
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;
}
