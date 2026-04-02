package POO;

public class ContaBancaria {
    private final String titular;
    private final String numero;
    private double saldo;

    //Construtor:
    public ContaBancaria(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    //Depositar:
    public boolean depositar (double valor){
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    //Sacar:
    public boolean sacar (double valor) {
        if (valor >= this.saldo){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //Gets
    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("contaBancaria{");
        sb.append("titular='").append(titular).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
