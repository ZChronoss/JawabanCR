package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class User {
 private String name;
 private List<UserRole> roles;

 public User(String name) {
     this.name = name;
     roles = new ArrayList<>();
 }

 public void addRole(UserRole role) {
     roles.add(role);
 }

 public List<UserRole> getRoles() {
     return roles;
 }

 public String getName() {
     return name;
 }
}
