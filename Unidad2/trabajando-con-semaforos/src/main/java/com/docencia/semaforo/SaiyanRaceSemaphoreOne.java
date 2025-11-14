package com.docencia.semaforo;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

public class SaiyanRaceSemaphoreOne implements Runnable {

    private final String name;
    private int distance = 0;
    private static final int GOAL = 100;
    private static final AtomicBoolean WINNER_DECLARED = new AtomicBoolean(false);
    private static final Semaphore SEMAPHORE = new Semaphore(1);

    public SaiyanRaceSemaphoreOne(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (!WINNER_DECLARED.get() && distance < GOAL) {
            SEMAPHORE.acquire();
            if (WINNER_DECLARED.get()) {
                break;
                
            }
            try {
                SEMAPHORE.acquire();
                int step = ThreadLocalRandom.current().nextInt(1, 11);
                distance += step;
                System.out.println(name + " avanzo " + step + " metros. Distancia total: " + distance+" metros.");
                if (distance >= GOAL){
                    if (WINNER_DECLARED.compareAndSet(false, true)) {
                    System.out.println(name + " ha ganado la carrera!");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                SEMAPHORE.release();    
        }
    }

    public static void main(String[] args) {

    }
}
}
