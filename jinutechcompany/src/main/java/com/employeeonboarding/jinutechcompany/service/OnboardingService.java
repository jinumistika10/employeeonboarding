package com.employeeonboarding.jinutechcompany.service;

import com.employeeonboarding.jinutechcompany.entity.OnboardingEntity;
import com.employeeonboarding.jinutechcompany.mapper.OnbordingMapper;
import com.employeeonboarding.jinutechcompany.repository.OnboardingRepository;
import com.swaggerexample.Swaggerex.model.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OnboardingService {

    private final OnboardingRepository onboardingRepository;
    private final OnbordingMapper onbordingMapper;

    public ResponseEntity<String> addEmployees(EmployeeDTO employeeDTO) {
        OnboardingEntity onboardingEntity = OnboardingEntity.builder()
                .name(employeeDTO.getName())
                .role(employeeDTO.getRole())
                .salary(employeeDTO.getSalary())
                .build();
        onboardingRepository.save(onboardingEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created");
    }

    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        List<OnboardingEntity> employeeList = onboardingRepository.findAll();

        List<EmployeeDTO> employeeDTOList = employeeList.stream()
                .map(onbordingMapper::entityToDTO)
                .toList();
        return ResponseEntity.ok(employeeDTOList);
    }
}
