package be.ehb.bvo.leanring.model;

import jakarta.persistence.*;

import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  public List<QuestionSeries> getQuestions() {
    return questions;
  }

  @OneToMany(cascade = CascadeType.ALL)
  private List<QuestionSeries> questions;

  private String name;

  private String email;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String password;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addSeries(QuestionSeries newserie) {
    this.questions.add(newserie);
  }
}