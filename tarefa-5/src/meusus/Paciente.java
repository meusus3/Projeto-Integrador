package meusus;

public class Paciente {
    protected String nome;
    protected char cpf;
    protected String datanasc;
    protected String sexo;
    protected char endpac;
    protected String email;
    protected char celular;

    public Paciente(String nome, String sexo, String email, String datanasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.datanasc = datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getCpf() {
        return cpf;
    }

    public void setCpf(char cpf) {
        this.cpf = cpf;
    }

    public final String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public char getEndpac() {
        return endpac;
    }

    public void setEndpac(char endpac) {
        this.endpac = endpac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getCelular() {
        return celular;
    }

    public void setCelular(char celular) {
        this.celular = celular;
    }
    
    public void status() {
        System.out.println("SOBRRE O PACIENTE");
        System.out.println("nome: " + this.getNome());
        System.out.println("sexo: " + this.getSexo());
        System.out.println("data de nascimento: " + this.getDatanasc());
        System.out.println("numero de celular: 000000000 " + this.getCelular());
        System.out.println("email: " + this.getEmail());
    }
}
