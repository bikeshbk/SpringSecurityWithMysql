package com.security.mysql.springSecurityMysql.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class UserModels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Column(name = "first_name")
    private String fname;

    @Column(name = "last_name")
    private String lname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private int status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleModels> roles;

    public UserModels() {
    }

    public UserModels(UserModels userModels){
        this.status = userModels.getStatus();
        this.username = userModels.getUsername();
        this.password = userModels.getPassword();
        this.lname = userModels.getLname();
        this.fname = userModels.getFname();
        this.id = userModels.getId();
    }

    public UserModels(int id, String fname, String lname,String username, String password, int status, Set<RoleModels> roles) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.status = status;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<RoleModels> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleModels> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserModels{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", roles=" + roles +
                '}';
    }
}
