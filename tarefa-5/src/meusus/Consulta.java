package meusus;

public class Consulta {
    protected String idConsulta;
    protected String descEspecialidade;
    protected String infoConsulta;

    public Consulta(String idConsulta, String descEspecialidade, String infoConsulta) {
        this.idConsulta = idConsulta;
        this.descEspecialidade = descEspecialidade;
        this.infoConsulta = infoConsulta;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDescEspecialidade() {
        return descEspecialidade;
    }

    public void setDescEspecialidade(String descEspecialidade) {
        this.descEspecialidade = descEspecialidade;
    }

    public String getInfoConsulta() {
        return infoConsulta;
    }

    public void setInfoConsulta(String infoConsulta) {
        this.infoConsulta = infoConsulta;
    }

    public void status () {
        
    }

}
