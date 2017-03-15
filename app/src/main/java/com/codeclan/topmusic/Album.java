package com.codeclan.topmusic;

public class Album {

        private int ranking;
        private String title;
        private String artist;
        private int year;

        public Movie(Integer ranking, String title, String artist, Integer year) {
            this.ranking = ranking;
            this.title = title;
            this.artist = artist;
            this.year = year;
        }

        public Integer getRanking() {
            return ranking;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist(){ return artist; }

        public Integer getYear() {
            return year;
        }

    }

}
