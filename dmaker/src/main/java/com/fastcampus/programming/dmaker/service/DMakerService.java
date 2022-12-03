package com.fastcampus.programming.dmaker.service;

import com.fastcampus.programming.dmaker.dto.CreateDeveloper;
import com.fastcampus.programming.dmaker.dto.CreateDeveloper.Request;
import com.fastcampus.programming.dmaker.entity.Developer;
import com.fastcampus.programming.dmaker.repository.DeveloperRepository;
import com.fastcampus.programming.dmaker.type.DeveloperLevel;
import com.fastcampus.programming.dmaker.type.DeveloperSkillType;
import jakarta.persistence.EntityManager;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DMakerService {
  private final DeveloperRepository developerRepository;
  private final EntityManager em;

  @Transactional
  public void createDeveloper(CreateDeveloper.Request request) {
    // business logic start
    Developer developer = Developer.builder()
      .developerLevel(DeveloperLevel.JUNGNIOR)
      .developerSkillType(DeveloperSkillType.FRONT_END)
      .experienceYears(2)
      .name("Olaf")
      .age(5)
      .build();

    developerRepository.save(developer);
  }
}
