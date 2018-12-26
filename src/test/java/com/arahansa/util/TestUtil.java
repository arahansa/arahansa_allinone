package com.arahansa.util;

import com.arahansa.domain.TestEntity;
import org.springframework.restdocs.payload.FieldDescriptor;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.subsectionWithPath;

/**
 * @author Lucas Choi
 */
public class TestUtil {

    public static FieldDescriptor[] getDesc(){
        FieldDescriptor[] desc = new FieldDescriptor[] {
                fieldWithPath("status").description("응답 상태"),
                fieldWithPath("data").description("응답 데이터"),
                fieldWithPath("msg").description("응답 메시지") };
        return desc;
    }

    // subsectionWithPath
}


