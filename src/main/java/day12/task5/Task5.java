package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("12314",199));
        members1.add(new MusicArtist("213124",199));
        MusicBand band1 = new MusicBand("Band1",2020,members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("dfgas",222));
        members2.add(new MusicArtist("sdfasfsdfs",222));
        MusicBand band2 = new MusicBand("Band2",2020,members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();

    }
}
