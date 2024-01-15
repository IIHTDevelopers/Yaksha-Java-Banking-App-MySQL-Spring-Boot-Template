package com.bankingapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bankingapplication.dto.UserDTO;
import com.bankingapplication.entity.User;
import com.bankingapplication.exception.NotFoundException;
import com.bankingapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO getUserById(Long id) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO addUser(UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUser(Long id, UserDTO userDTO) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteUser(Long id) throws NotFoundException {
		// write your logic here
		return false;
	}

	public List<UserDTO> mapUsersToDTOs(List<User> users) {
		// write your logic here
		return null;
	}

	@Override
	public List<UserDTO> searchUsersByName(String name) {
		// write your logic here
		return null;
	}
}
