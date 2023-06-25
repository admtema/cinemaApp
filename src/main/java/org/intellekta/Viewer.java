package org.intellekta;

import org.springframework.stereotype.Component;

@Component("viewer")
public class Viewer {
    private String nickname;
    private int age;
    private int watchedMoviesNum;

    public Viewer() {
    }

    public Viewer(String nickname, int age, int watchedMoviesNum) {
        this.nickname = nickname;
        this.age = age;
        this.watchedMoviesNum = watchedMoviesNum;
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

    public void setWatchedMoviesNum(int watchedMoviesNum) {
        this.watchedMoviesNum = watchedMoviesNum;
    }
}
