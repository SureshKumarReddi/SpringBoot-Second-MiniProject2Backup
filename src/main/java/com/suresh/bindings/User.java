package com.suresh.bindings;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class User {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String userEmail;
	private Integer userPhno;
	private LocalDate userDob;
	private String userGender;
	private Integer userCountry;
	private Integer userState;
	private Integer userCity;
	private String userPassword;
	private String userAccountStatus;
	private LocalDate createdDate;
	private LocalDate updatedDate;
}
