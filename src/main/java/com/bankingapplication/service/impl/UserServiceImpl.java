package com.bankingapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bankingapplication.dto.UserDTO;
import com.bankingapplication.exception.NotFoundException;
import com.bankingapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<UserDTO> getAllUsers() {
		return null;
	}

	@Override
	public UserDTO getUserById(Long id) throws NotFoundException {
		return null;
	}

	@Override
	public UserDTO addUser(UserDTO userDTO) {
		return null;
	}

	@Override
	public UserDTO updateUser(Long id, UserDTO userDTO) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deleteUser(Long id) throws NotFoundException {
		return false;
	}
}
