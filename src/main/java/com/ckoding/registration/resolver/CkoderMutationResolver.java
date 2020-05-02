package com.ckoding.registration.resolver;

import com.ckoding.registration.entity.Ckoder;
import com.ckoding.registration.repository.CkoderRepository;
import com.ckoding.registration.wrapper.CkoderWrapper;
import graphql.kickstart.tools.GraphQLMutationResolver;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CkoderMutationResolver implements GraphQLMutationResolver {

  @Autowired
  CkoderRepository ckoderRepository;

  public Ckoder addCkoder(CkoderWrapper ckoderWrapper) {
    Ckoder ckoder = Ckoder.builder().
        ckoderId(UUID.randomUUID()).firstName(ckoderWrapper.getFirstName()).lastName(ckoderWrapper.getLastName())
        .emailId(ckoderWrapper.getEmailId()).password(ckoderWrapper.getPassword()).build();
    return ckoderRepository.save(ckoder);

  }
}
