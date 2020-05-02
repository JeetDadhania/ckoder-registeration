package com.ckoding.registration.repository;

import com.ckoding.registration.entity.Ckoder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CkoderRepository extends JpaRepository<Ckoder, Integer> {

  Ckoder findByEmailId(String emailId);
}
