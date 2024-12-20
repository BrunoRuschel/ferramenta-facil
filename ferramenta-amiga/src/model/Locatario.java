package model;

public class Locatario {

    private String cpf;
    private String nome;
    private String email;
    private String senha;

    public Locatario(String cpf, String nome, String email, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Locatario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public boolean isCpfValido() {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public boolean isEmailValido() {
        return email != null && email.matches("^[\\w-.]+@[\\w-]+\\.[a-z]{2,}$");
    }
}
