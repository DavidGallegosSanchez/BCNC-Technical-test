package com.gallegos.bcnc.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class ProductControllerTest {

    protected MockMvc mvc;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Test
    void getMethodTest() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders
                .get("/api/get_product_by_condionts?applicationDate=2020-06-14T10:00:00.000&productIdentifier=35455&brandIdentifier=1")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content("{\"price list\":1}")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Assertions.assertTrue(content.contains("\"price list\":1"));
    }

    @Test
    void postMethodTest() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders
                .post("/api/get_product_by_condionts_response")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content("{\"applicationDate\":\"2020-06-14T10:00:00.000\",\"productIdentifier\": \"35455\",\"brandIdentifier\": \"1\"}"))
                .andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assertions.assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Assertions.assertTrue(content.contains("\"priceList\":1"));
    }
}
