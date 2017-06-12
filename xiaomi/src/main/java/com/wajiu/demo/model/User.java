package com.wajiu.demo.model;
public class User {
    private String username;
    private Integer age;
    private String token;
    public User(String username, Integer age,String tokrn) {
        this.username = username;
        this.age = age;
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
    
    
}
