package org.formacion.procesos.services.abstractas;

import java.util.List;

import org.formacion.procesos.domain.ProcessType;
import org.formacion.procesos.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ComandoServiceAbstract {
    String comando;
    List<String> parametros;
    ProcessType tipo;

    @Autowired
    FileRepository fileRepository;

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public List<String> getParametros() {
        return parametros;
    }

    public void setParametros(List<String> parametros) {
        this.parametros = parametros;
    }

    public void procesarLinea(String linea) {
        String[] arrayComando = linea.split(" ");
        this.setComando(arrayComando[0]);
        System.out.println("Comando: " + this.getComando());
        if (!validar(arrayComando)) {
            System.out.println("El comando es invalido");
            return;

        }

        // "linea= ps aux |grep java"
        Process proceso;
        try {
            proceso = new ProcessBuilder("sh", "-c", linea + "> mis_procesos.txt")
                    .start();
            proceso.waitFor();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        imprimirMensaje();

    }

    public boolean ejecutarProceso(Process proceso) {
        try {
            proceso.waitFor();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;
    }

    public ProcessType getTipo() {
        return tipo;
    }

    public void setTipo(ProcessType tipo) {
        this.tipo = tipo;
    }

    public abstract void imprimirMensaje();

    public abstract boolean validar(String[]arrayComando);

    public boolean validarComando(){
        if (!this.getComando().toUpperCase().equals(getTipo().toString())) {
            System.out.println("El comando es invalido");
            return false;

        }
        return true;
     };
}
