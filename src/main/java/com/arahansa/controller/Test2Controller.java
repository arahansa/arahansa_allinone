package com.arahansa.controller;

import com.arahansa.domain.TestEntity;
import com.arahansa.dto.CommonRes;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Lucas Choi
 */
@RestController
@RequestMapping("/test2")
public class Test2Controller {

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
