package com.employeeonboarding.jinutechcompany.mapper;

import com.employeeonboarding.jinutechcompany.entity.OnboardingEntity;
import com.swaggerexample.Swaggerex.model.EmployeeDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OnbordingMapper {

    private final ModelMapper modelMapper;

    public EmployeeDTO entityToDTO(OnboardingEntity onboardingEntity){
        return modelMapper.map(onboardingEntity, EmployeeDTO.class);
    }
}
