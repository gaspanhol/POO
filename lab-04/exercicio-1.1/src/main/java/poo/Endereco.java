package poo;

public class Endereco {
    private String rua;
    private int numeroEndereco;
    private String cidade;
    private String estado;
    private String tipoLocal;

    public Endereco(String rua, int numeroEndereco, String cidade, String estado, String tipoLocal) {
        this.rua = rua;
        this.numeroEndereco = numeroEndereco;
        this.cidade = cidade;
        this.estado = estado;
        this.tipoLocal = tipoLocal;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }
}
