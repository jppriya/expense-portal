package com.jp.poc.incomeexpense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jp.poc.incomeexpense.model.IncomeExpenseDto;
import com.jp.poc.incomeexpense.service.IIncomeExpenseService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "Swagger Controller Basics", value="income controller")
public class IncomeExpenseController {

    @Autowired
    private IIncomeExpenseService incomeExpenseService;

	@ApiOperation(value = "View List of all Users", response = List.class)
    @PostMapping(value = "/upload", headers = "content-type=multipart/form-data", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public List<IncomeExpenseDto> uploadEmployee(@RequestPart MultipartFile multipartFile) {
       return  incomeExpenseService.uploadIncomeAndExpense(multipartFile);
    }
    
    
}
