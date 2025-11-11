package org.formacion.procesos.concurrencia;

import java.util.concurrent.Semaphore;

public class SemaforoEjemplo {
    // Creamos un semáforo con 3 permisos (máximo 3 hilos pueden acceder simultáneamente)
    private static final Semaphore semaforo = new Semaphore(3);

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Trabajador("Trabajador " + i).start();
        }
    }

    static class Trabajador extends Thread {
        private String nombre;

        public Trabajador(String nombre) {
            this.nombre = nombre;
        }

        public void run() {
            try {
                System.out.println(nombre + " esperando para acceder al recurso...");
                
                semaforo.acquire();
                System.out.println(nombre + " ha obtenido acceso al recurso.");
                
                Thread.sleep(2000);

                System.out.println(nombre + " ha terminado y libera el recurso.");
                semaforo.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}