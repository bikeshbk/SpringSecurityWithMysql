package com.security.mysql.springSecurityMysql.models;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class RoleModels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role_name")
    private String name;

    public RoleModels() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}