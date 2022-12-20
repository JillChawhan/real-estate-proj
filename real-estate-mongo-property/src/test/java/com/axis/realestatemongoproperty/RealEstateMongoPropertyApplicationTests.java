package com.axis.realestatemongoproperty;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
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

import com.axis.realestatemongoproperty.controller.PropertiesController;
import com.axis.realestatemongoproperty.entity.Properties;
import com.axis.realestatemongoproperty.service.PropertiesService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.axis.realestatemongoproperty.RealEstateMongoPropertyApplication.class,
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class RealEstateMongoPropertyApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PropertiesService propertyService;
	
	@Before
	public void setup() {
		PropertiesController propertiesController = new PropertiesController();
		propertiesController.setPropertiesService(propertyService);
		mockMvc = MockMvcBuilders.standaloneSetup(propertiesController).build();
	}
	
	Properties property = new Properties("63980f216231f139f0c3b72b", "For Sale", 12, "Flat", 2010, 2, 3, 1, 12345667, 1350, "12-B", "Raigad Chowk", 
			"Mumbai", "Maharashtra", "India", 400077,
			"https://img.staticmb.com/mbphoto/property/cropped_images/2022/Mar/03/Photo_h180_w240/59809627_3_1646317656229-952_180_240.jpg");
	
	@Test
	public void getPropertyByIdTest() throws Exception{
		
		Mockito.when(propertyService.getPropertyById(Mockito.anyString())).thenReturn(property);
		
		RequestBuilder reqBuilder = MockMvcRequestBuilders.get("/property/63980f216231f139f0c3b72b").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(reqBuilder).andReturn();
		
		String expectedProperty = "{'propertyId':'63980f216231f139f0c3b72b', 'sellType':'For Sale','daysOnMarket':12,"
				+ "'type':'Flat', 'yearBuilt':2010, 'bathroom':2, 'bed':3, 'livingRoom':1, 'price':12345667, "
				+ "'squareFeet':1350, 'plotNumber':'12-B', 'streetName':'Raigad Chowk', 'city':'Mumbai', 'state':'Maharashtra', 'country':'India', "
				+ "'pinCode':400077,"
				+ "'images':'https://img.staticmb.com/mbphoto/property/cropped_images/2022/Mar/03/Photo_h180_w240/59809627_3_1646317656229-952_180_240.jpg'}";
		
		JSONAssert.assertEquals(expectedProperty, result.getResponse().getContentAsString(), false);

	}
	
}
