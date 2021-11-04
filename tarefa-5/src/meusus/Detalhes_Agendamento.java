package meusus;

public class Detalhes_Agendamento {
    protected char tratamento;
    protected char vacinação;
    protected String consulta;
    protected String exame;

    public Detalhes_Agendamento(String consulta, String exame) {
        this.consulta = consulta;
        this.exame = exame;
    }

    public char getTratamento() {
        return tratamento;
    }

    public void setTratamento(char tratamento) {
        this.tratamento = tratamento;
    }

    public char getVacinação() {
        return vacinação;
    }

    public void setVacinação(char vacinação) {
        this.vacinação = vacinação;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }
    
    public void status () {
        System.out.println("" + this.consulta);
        System.out.println("" + this.exame);
    }

}
