package homework3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(10);
        Tube tube = new Tube(5);

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(tube);

        for (Instrument instrument: instruments) {
            instrument.play();
        }
        System.out.println(instruments);

    }
}
