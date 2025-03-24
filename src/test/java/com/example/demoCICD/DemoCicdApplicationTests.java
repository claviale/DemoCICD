package com.example.demoCICD;

import com.example.demoCICD.service.BankService;
import com.example.demoCICD.service.ServiceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoCicdApplicationTests {

	@Autowired
	BankService bankService;

	@Test
	void contextLoads() {
	}

	@Test
	void RG_5151() {

		//Cas 789
		ServiceResponseDTO responseDTO789 = bankService.debit(6000);
		assertEquals("789", responseDTO789.code);

		//Cas 207
		ServiceResponseDTO responseDTO207 = bankService.debit(1200);
		assertEquals("207", responseDTO207.code);
	}
}
