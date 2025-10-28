package com.luismerces.workshopmongo.dto;

import com.luismerces.workshopmongo.domain.User;

public class AuthorDTO {

    private String id;
    private String name;

    public AuthorDTO(User obj) {
        this.id = obj.getName();
        this.name = obj.getEmail();
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
}
