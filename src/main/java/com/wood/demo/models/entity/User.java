package com.wood.demo.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String name;
    private String midName;
    private String lastName;
    private AuthorityLevel authorityLevelId;

    public User() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "mid_name")
    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToOne
    @JoinColumn(name = "authority_level_id")
    public AuthorityLevel getAuthorityLevelId() {
        return authorityLevelId;
    }

    public void setAuthorityLevelId(AuthorityLevel authorityLevelId) {
        this.authorityLevelId = authorityLevelId;
    }
}
