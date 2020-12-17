package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;

    }

    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("massive attack", 1994);
        MusicBand mb2 = new MusicBand("the prodigy", 1990);
        MusicBand mb3 = new MusicBand("кис кис", 2018);
        MusicBand mb4 = new MusicBand("asap mob", 2006);
        MusicBand mb5 = new MusicBand("2h company", 2001);
        MusicBand mb6 = new MusicBand("asap rocky", 2018);
        MusicBand mb7 = new MusicBand("the beatles", 1960);
        MusicBand mb8 = new MusicBand("placebo", 1994);
        MusicBand mb9 = new MusicBand("cradle of filth", 1991);
        MusicBand mb10 = new MusicBand("Anorexia Nervosa", 1991);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(mb1);
        musicBands.add(mb2);
        musicBands.add(mb3);
        musicBands.add(mb4);
        musicBands.add(mb5);
        musicBands.add(mb6);
        musicBands.add(mb7);
        musicBands.add(mb8);
        musicBands.add(mb9);
        musicBands.add(mb10);
        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));
    }
}


