package com.codeclan.topmusic;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


    public class AlbumTest {

        Album album;

        @Before
        public void before() {
            album = new Album(1, "Thriller", "Michael Jackson", 1982);
        }

        @Test
        public void getRankingTest() {
            assertEquals((Integer)1, album.getRanking());

        }

        @Test
        public void getTitleTest() {
            assertEquals("Thriller", album.getTitle());

        }

        @Test
        public void getArtistTest() {
            assertEquals("Michael Jackson", album.getArtist());
        }

        @Test
        public void getYearTest() {
            assertEquals((Integer)1982, album.getYear());

        }
    }
}