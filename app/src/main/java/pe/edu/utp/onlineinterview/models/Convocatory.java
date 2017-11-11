package pe.edu.utp.onlineinterview.models;

/**
 * Created by Cristian on 10/11/2017.
 */

public class Convocatory {
    private int id;
    private String createAt;
    private String state;
    private String description;
    private Business business;

    public int getId() {
        return id;
    }

    public Convocatory setId(int id) {
        this.id = id;
        return this;
    }

    public String getCreateAt() {
        return createAt;
    }

    public Convocatory setCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    public String getState() {
        return state;
    }

    public Convocatory setState(String state) {
        this.state = state;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Convocatory setDescription(String description) {
        this.description = description;
        return this;
    }

    public Business getBusiness() {
        return business;
    }

    public Convocatory setBusiness(Business business) {
        this.business = business;
        return this;
    }
}
