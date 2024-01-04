package tech.buildrun.prototype;

import java.util.UUID;

public class User implements Prototype{

    private UUID id;
    private String email;
    private String password;
    private String username;

    private User(User user) {
        this.id = user.id;
        this.email = user.email;
        this.password = user.password;
        this.username = user.username;
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Prototype clone() {
        return new User(this);
    }


}
