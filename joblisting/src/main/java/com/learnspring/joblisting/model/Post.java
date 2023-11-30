package com.learnspring.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(value = "JobPost")
public class Post {
    private String Profile;
    private String techs[];
    private String desc;
    private int exp;

    public Post() {
    }

    public String getProfile() {
        return Profile;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Profile='" + Profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                '}';
    }


    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setProfile(String profile) {
        Profile = profile;
    }
}
