package com.rafaa.activedirectoryservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rafaa.activedirectoryservice.dto.ActiveDirectoryRequest;
import com.rafaa.activedirectoryservice.repository.ActiveDirectoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
class ActiveDirectoryServiceApplicationTests {

//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	ActiveDirectoryRepository activeDirectoryRepository;
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
//	@Test
//	void shouldCreateActiveDirectory() throws Exception {
//		ActiveDirectoryRequest activeDirectoryRequest = getActiveDirectoryRequest();
//		String activeDirectoryRequestString = objectMapper.writeValueAsString(activeDirectoryRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/active-directory")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(activeDirectoryRequestString)
//		).andExpect(status().isCreated());
//		Assertions.assertEquals(1, activeDirectoryRepository.findAll().size());
//	}
//
//	private ActiveDirectoryRequest getActiveDirectoryRequest() {
//		return ActiveDirectoryRequest.builder()
//				.name("active_one")
//				.description("version one")
//				.build();
//	}

	@Test
	public void one(){

	}
}


