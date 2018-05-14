package cBaird;

import com.google.gson.annotations.SerializedName;

public class User {
    private String name;

    @SerializedName("followers_count")
    private int followers;

    private Coordinates coordinates;


    public User(String name, int followers) {
        this.name = name;
        this.followers = followers;
    }

    //getters
    public Coordinates getCoordinates() { return coordinates; }

    public String getName() {
        return name;
    }

    public int getFollowers() {
        return followers;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFollowers(int followers) { this.followers = followers; }

    public void setCoordinates(Coordinates coordinates) { this.coordinates = coordinates; }
}
