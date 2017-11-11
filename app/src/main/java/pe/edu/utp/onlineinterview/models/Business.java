package pe.edu.utp.onlineinterview.models;

/**
 * Created by Cristian on 10/11/2017.
 */

public class Business {
    private int id;
    private String ruc;
    private String name;
    private String email;
    private String address;
    private String type;
    private User user;

    public int getId() {
        return id;
    }

    public Business setId(int id) {
        this.id = id;
        return this;
    }

    public String getRuc() {
        return ruc;
    }

    public Business setRuc(String ruc) {
        this.ruc = ruc;
        return this;
    }

    public String getName() {
        return name;
    }

    public Business setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Business setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Business setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getType() {
        return type;
    }

    public Business setType(String type) {
        this.type = type;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Business setUser(User user) {
        this.user = user;
        return this;
    }
}
