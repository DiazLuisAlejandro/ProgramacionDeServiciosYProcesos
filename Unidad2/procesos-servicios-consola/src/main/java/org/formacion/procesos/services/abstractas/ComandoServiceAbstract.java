package org.formacion.procesos.services.abstractas;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.formacion.procesos.domain.ProcessType;
import org.formacion.procesos.repositories.FileRepository;
import org.formacion.procesos.repositories.interfaces.CRUDInterface;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ComandoServiceAbstract {

    CRUDInterface fileRepository;

    private String comando;
    private List<String> parametros;
    private ProcessType tipo;
    private String regExp;

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

    public String getRegExp() {
        return regExp;
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
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

        if (this.comando == "top") {
            Process proceso;
            try {
                proceso = new ProcessBuilder(linea + " -bn 1 >> src\\main\\resources\\mis_procesos.txt")
                        .start();
                proceso.waitFor();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else if (this.comando=="ps") {
            Process proceso;
            try {
                proceso = new ProcessBuilder("sh", "-c", linea + ">> src\\main\\resources\\mis_procesos.txt")
                        .start();
                proceso.waitFor();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else if (this.comando=="lsof") {
            Process proceso;
            try {
                proceso = new ProcessBuilder("sh", "-c", linea + ">> src\\main\\resources\\mis_procesos.txt")
                        .start();
                proceso.waitFor();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

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

    public boolean validar(String[] arrayComando) {

        if (!validarComando()) {
            return false;

        }

        if (arrayComando.length < 2) {
            return true;

        }

        String parametro = arrayComando[1];

        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher = pattern.matcher(parametro);

        if (!matcher.find()) {
            System.out.println("No cumple");
            return false;
        }

        return true;
    }

    public boolean validarComando() {
        if (!this.getComando().toUpperCase().equals(getTipo().toString())) {
            System.out.println("El comando es invalido");
            return false;

        }
        return true;
    }

    public CRUDInterface getFileRepository() {
        return fileRepository;
    }

    @Autowired
    public void setFileRepository(CRUDInterface fileRepository) {
        this.fileRepository = fileRepository;
    };
}
