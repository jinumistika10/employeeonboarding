package com.employeeonboarding.jinutechcompany.controller;

import com.employeeonboarding.jinutechcompany.service.OnboardingService;
import com.swaggerexample.Swaggerex.api.EmployeeApi;
import com.swaggerexample.Swaggerex.model.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class OnboardingController implements EmployeeApi {

    @Autowired
    private final OnboardingService onboardingService;

    @Override
    public ResponseEntity<String> addEmployees(EmployeeDTO employeeDTO) {
        return onboardingService.addEmployees(employeeDTO);
    }

    @Override
    public ResponseEntity<List<EmployeeDTO>> getEmployees() {
        return onboardingService.getAllEmployees();
    }
}
