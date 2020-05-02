package com.ckoding.registration.wrapper;

import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CkoderWrapper {

  private String firstName;

  private String lastName;

  @Email
  private String emailId;

  private String password;

  private Integer phoneNo;
}
