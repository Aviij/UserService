package com.userservice.UserService.dtos;

import java.util.List;

public class UserTPDTO {

    private String id;
    private String name;
    private String age;
    private List<String> tps;


    public UserTPDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getTps() {
        return tps;
    }

    public void setTps(List<String> tps) {
        this.tps = tps;
    }
}
