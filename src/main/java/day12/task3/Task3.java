package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
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

        List<MusicBand> bands = new ArrayList<>();
        bands.add(mb1);
        bands.add(mb2);
        bands.add(mb3);
        bands.add(mb4);
        bands.add(mb5);
        bands.add(mb6);
        bands.add(mb7);
        bands.add(mb8);
        bands.add(mb9);
        bands.add(mb10);

        Collections.shuffle(bands);
    }
}
