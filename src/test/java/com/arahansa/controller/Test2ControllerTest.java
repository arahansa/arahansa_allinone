package com.arahansa.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.restdocs.payload.FieldDescriptor;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;

@RunWith(SpringRunner.class)
@WebMvcTest(Test2Controller.class)
@AutoConfigureRestDocs(outputDir = "generated-snippets")
public class Test2ControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {

        FieldDescriptor[] desc = new FieldDescriptor[] {
                fieldWithPath("status").description("Response Status"),
                fieldWithPath("data").description("Response data"),
                fieldWithPath("msg").description("Response Msg") };

        this.mockMvc.perform(get("/test2"))
                .andExpect(status().isOk())
                .andDo(document("test2", responseFields(desc)));
    }

}