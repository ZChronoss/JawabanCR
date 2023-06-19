package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class Role {
 private String roleName;
 private List<UserRole> userRole;

 public Role(String roleName) {
     this.roleName = roleName;
     userRole = new ArrayList<>();
 }

 public void addUser(UserRole newuserRole) {     
     userRole.add(newuserRole);
 }

 public List<UserRole> getUser() {
     return userRole;
 }

 public String getRoleName() {
     return roleName;
 }
}
