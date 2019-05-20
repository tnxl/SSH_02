package com.skynet.user;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "wlg", catalog = "")
public class UserEnity {
    private String username;
    private String password;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEnity userEnity = (UserEnity) o;

        if (username != null ? !username.equals(userEnity.username) : userEnity.username != null) return false;
        if (password != null ? !password.equals(userEnity.password) : userEnity.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
