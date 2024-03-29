package com.bankingapplication.boundary;

import static com.bankingapplication.utils.TestUtils.boundaryTestFile;
import static com.bankingapplication.utils.TestUtils.currentTest;
import static com.bankingapplication.utils.TestUtils.testReport;
import static com.bankingapplication.utils.TestUtils.yakshaAssert;

import java.io.IOException;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bankingapplication.dto.TransactionDTO;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class TransactionBoundaryTest {

	private static Validator validator;

	@BeforeAll
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testAmountNotNull() throws IOException {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setAmount(null);
		Set<ConstraintViolation<TransactionDTO>> violations = validator.validate(transactionDTO);
		try {
			yakshaAssert(currentTest(), !violations.isEmpty(), boundaryTestFile);
		} catch (Exception e) {
			yakshaAssert(currentTest(), false, boundaryTestFile);
		}
	}

	@Test
	public void testTransactionDateNotNull() throws IOException {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setTransactionDate(null);
		Set<ConstraintViolation<TransactionDTO>> violations = validator.validate(transactionDTO);
		try {
			yakshaAssert(currentTest(), !violations.isEmpty(), boundaryTestFile);
		} catch (Exception e) {
			yakshaAssert(currentTest(), false, boundaryTestFile);
		}
	}

	@Test
	public void testUserDTONotNull() throws IOException {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setUserDTO(null);
		Set<ConstraintViolation<TransactionDTO>> violations = validator.validate(transactionDTO);
		try {
			yakshaAssert(currentTest(), !violations.isEmpty(), boundaryTestFile);
		} catch (Exception e) {
			yakshaAssert(currentTest(), false, boundaryTestFile);
		}
	}
}
