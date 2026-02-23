package com.employeeonboarding.jinutechcompany.repository;

import com.employeeonboarding.jinutechcompany.entity.OnboardingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OnboardingRepository extends MongoRepository<OnboardingEntity, String> {
}
