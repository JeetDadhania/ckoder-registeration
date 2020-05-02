package com.ckoding.registration.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ckoder {

  @Id
  @Column(name = "ckoder_id", nullable = false)
  private UUID ckoderId;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Email
  @Column(name = "email_id", nullable = false, unique = true)
  private String emailId;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "phone_no")
  private Integer phoneNo;
}
