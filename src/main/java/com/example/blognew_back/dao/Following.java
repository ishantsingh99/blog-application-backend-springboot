package com.example.blognew_back.dao;



import javax.persistence.*;

//@Table(name="following")
@Entity
public class Following {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long followingId;
    @ManyToOne
    private User currentUser;
    @ManyToOne
    private User following;

    public Following() {}

    public Following(User currentUser, User following) {
        this.currentUser = currentUser;
        this.following = following;
    }

    public Long getFollowingId() {
        return followingId;
    }

    public void setFollowingId(Long followingId) {
        this.followingId = followingId;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }
}
