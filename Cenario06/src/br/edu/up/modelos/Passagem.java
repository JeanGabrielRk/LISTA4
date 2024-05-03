package modelos;

import java.time.LocalDateTime;

public class Passagem {

    private String numeroAssento;
    private String classeAssento;
    private LocalDateTime dataVoo;

    public Passagem(String numeroAssento, String classeAssento, LocalDateTime dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public String getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }

}
