package com.ckoding.registration.repository;

import com.ckoding.registration.entity.Ckoder;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CkoderRepository extends JpaRepository<Ckoder, UUID> {

  Ckoder findByEmailId(String emailId);
}
