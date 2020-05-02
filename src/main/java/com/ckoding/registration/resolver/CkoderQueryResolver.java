package com.ckoding.registration.resolver;

import com.ckoding.registration.entity.Ckoder;
import com.ckoding.registration.repository.CkoderRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CkoderQueryResolver implements GraphQLQueryResolver {

  @Autowired
  private CkoderRepository ckoderRepository;

  public List<Ckoder> getCkoder() {
    return ckoderRepository.findAll();
  }

  public String loginCkoder(String emailId, String password) {
    //test code
    Ckoder ckoder = ckoderRepository.findByEmailId(emailId);
    if (ckoder != null) {
      if (ckoder.getPassword().equals(password)) {
        return "Success Login";
      }
    }
    return "Login unsuccessful";
  }

}
