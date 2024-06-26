package com.ead.course.dtos;

import java.util.UUID;

import com.ead.course.enums.UserStatus;
import com.ead.course.enums.UserType;

import lombok.Data;

@Data
public class UserDto {

	private UUID userId;
	private String username;
	private String email;
    private String password;
	private String oldPassword;
	private String fullName;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;
    private UserStatus userStatus;
    private UserType userType;
	
	
}
