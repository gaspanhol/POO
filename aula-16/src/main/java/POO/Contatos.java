package POO;

import java.time.LocalDate;

public class Contatos {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefones telefone;
    private Email email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Contatos(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone (String rotulo, String numero) {
    return telefone.add(rotulo, numero);
    }

    public boolean addEmail (String rotulo, String email) {
        return this.email.add(rotulo, email);
    }

    public boolean removeTelefone (String rotulo){
        return removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo){
        return email.remove(rotulo);
    }

    public boolean updateTelefone (String rotulo, String numero){
        return updateTelefone(rotulo, numero);
    }

    public boolean updateEmail (String rotulo, String email){
        return this.email.update(rotulo, email);
    }

    @Override
    public String toString() {
        return "Contato: " + "\n" +
                "Nome =  " + nome + "\n" +
                "Sobrenome = " + sobrenome + "\n" +
                "Data de nascimento = " + dataNasc + "\n" +
                "Telefone = " + telefone.toString() + "\n" +
                "Email = " + email.toString() + "\n";
    }
}
