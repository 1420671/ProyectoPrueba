package pe.edu.utp.onlineinterview.models;

/**
 * Created by Cristian on 10/11/2017.
 */

public class Profile {
    private String id;
    private String createAt;
    private String place;
    private String description;
    private Business business;

    public String getId() {
        return id;
    }

    public Profile setId(String id) {
        this.id = id;
        return this;
    }

    public String getCreateAt() {
        return createAt;
    }

    public Profile setCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Profile setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Profile setDescription(String description) {
        this.description = description;
        return this;
    }

    public Business getBusiness() {
        return business;
    }

    public Profile setBusiness(Business business) {
        this.business = business;
        return this;
    }
}
