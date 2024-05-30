package com.nermink.authorizationserver.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.RandomStringUtils;

@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "client_scope")
public class ClientScope {

  @Id
  private String id;
  private String scope;

  public ClientScope(String scope) {
    this.id = RandomStringUtils.randomAlphanumeric(10);
    this.scope = scope;
  }
}
