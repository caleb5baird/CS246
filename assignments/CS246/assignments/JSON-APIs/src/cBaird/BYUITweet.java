package cBaird;

public class BYUITweet {
    private User user;
    private String text;

    public BYUITweet() {

    }

    //Getters
    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    //Setters
    public void setUser(User user) { this.user = user; }

    public void setText(String text) {
        this.text = text;
    }

}
