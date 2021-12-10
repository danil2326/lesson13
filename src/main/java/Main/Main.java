package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {

    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {

        Race race = new Race(8,
                new Road(60),
                new Tunnel(80, 4),
                new Road(40),
                new Tunnel(30, 2),
                new Road(100),
                new Road(20));
        race.makeRace();

    }
}






