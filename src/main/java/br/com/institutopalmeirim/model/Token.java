package br.com.institutopalmeirim.model;

import br.com.institutopalmeirim.enums.TokenType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "token", schema = "profile")
@SequenceGenerator(name = "TOKEN_GENERATOR", sequenceName = "TOKEN_SEQ", allocationSize = 1)
public class Token {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TOKEN_GENERATOR")
  public Integer id;

  @Column(unique = true)
  public String token;

  @Enumerated(EnumType.STRING)
  public TokenType tokenType = TokenType.BEARER;

  public boolean revoked;

  public boolean expired;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  public User user;
}