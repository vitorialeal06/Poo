package exercicios;

import java.time.LocalDate;

public class Universidade extends Departamento {
    private String local;

    public Universidade(String nome, String departamento) {
        super(departamento);
        this.local = nome;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String nome) {
        this.local = nome;
    }
}
