package org.intellekta;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("viewer")
public class Viewer {
    private String nickname;
    private int age;
    private int watchedMoviesNum;

    private List<Cinema> cinemaList;

    public Viewer() {
    }

    public Viewer(String nickname, int age, List<Cinema> cinemaList) {
        this.nickname = nickname;
        this.age = age;
        this.cinemaList=cinemaList;
        this.watchedMoviesNum = this.cinemaList.size();
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWatchedMoviesNum() {
        return watchedMoviesNum;
    }

    public void setWatchedMoviesNum(List<Cinema> cinemaList) {
        this.watchedMoviesNum = this.cinemaList.size();
    }
}
