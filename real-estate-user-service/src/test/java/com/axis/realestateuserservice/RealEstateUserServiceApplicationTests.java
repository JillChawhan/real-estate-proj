package com.axis.realestateuserservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.axis.realestateuserservice.controller.UserDetailsController;
import com.axis.realestateuserservice.entity.UserDetails;
import com.axis.realestateuserservice.service.UserDetailsService;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.*;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.axis.realestateuserservice.RealEstateUserServiceApplication.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class RealEstateUserServiceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserDetailsService userDetailsService;
	
	@Before
	public void setup() {
		UserDetailsController userDetailsController = new UserDetailsController();
		userDetailsController.setUserDetailsService(userDetailsService);
		mockMvc= MockMvcBuilders.standaloneSetup(userDetailsController).build();
	}
	
	UserDetails userDetails = new UserDetails(2, "Matt", "Murdock", "mattym@gmail.com","+91 8191541288", "mattyboy123");
	
	@Test
	public void getUserByIdTest() throws Exception{
		
		Mockito.when(userDetailsService.getUserById(Mockito.anyLong())).thenReturn(userDetails);
		
		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/user/2").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(reqBuilder).andReturn();
		
		String expectedUser = "{'userId':2, 'firstName':'Matt', 'lastName':'Murdock', 'emailId':'mattym@gmail.com', "
				+ "'phoneNumber':'+91 8191541288', 'password':'mattyboy123'}";
		
		JSONAssert.assertEquals(expectedUser, result.getResponse().getContentAsString(), false);
	}
	
	UserDetails <List> users = new UserDetails();
	
}
