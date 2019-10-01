package com.company;
class Song {        // Song 클래스 선언
    String title;
    String artist;
    int year;
    String country;

    public void show(){     // 객체의 노래 정보를 출력하는 메소드
        System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
    public Song() { }   // 기본 생성자
    public Song(String title, String art, int year, String country) {  // 매개변수 생성자
        this.title = title;
        this.artist = art;
        this.year = year;
        this.country = country;
    }
}
public class exam4_3 {
    public static void main(String[] args) {    // main 함수
        Song mySong = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        mySong.show();      // show 메소드 호출
    }
}
