package com.arahansa.controller;

import com.arahansa.domain.TestEntity;
import com.arahansa.dto.CommonRes;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Lucas Choi
 */
@RestController
public class TestController {

    @GetMapping
    public CommonRes helloworld(){
        return new CommonRes();
    }

    @PostMapping
    public CommonRes insertTestEntity(@RequestBody @Valid TestEntity testEntity, BindingResult errors){
        if(errors.hasErrors()){
            return new CommonRes(CommonRes.VALID, "밸리데이션 에러");
        }
        return new CommonRes();
    }
}
