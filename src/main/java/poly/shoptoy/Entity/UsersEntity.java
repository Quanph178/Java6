package poly.shoptoy.Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "dochoi", catalog = "")
public class UsersEntity {

    @Id
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "fullname")
    private String fullname;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "status")
    private boolean status;
    @Basic
    @Column(name = "role")
    private int role;
    @Basic
    @Column(name = "img_use")
    private String imgUse;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getImgUse() {
        return imgUse;
    }

    public void setImgUse(String imgUse) {
        this.imgUse = imgUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return status == that.status && role == that.role && Objects.equals(username, that.username) && Objects.equals(fullname, that.fullname) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(imgUse, that.imgUse);
    }


}
