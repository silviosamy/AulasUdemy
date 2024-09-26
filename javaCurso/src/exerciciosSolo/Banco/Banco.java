package exerciciosSolo.Banco;

public class Banco {

    private String nomeBanco;
    private String agencia;
    private String conta;

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Banco(String nomeBanco, String agencia, String conta) {
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.conta = conta;
    }
}
