package modelo.heranca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class AlunoBolsista extends Aluno {

    private double valorBolsa;

    public AlunoBolsista() {

    }

    public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
