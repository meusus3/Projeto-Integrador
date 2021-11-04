package meusus;

public class Vacinaçao {
    protected String idVacinação;
    protected String descVacinação;
    protected char efeitoColateral;
    public void status () {
        
    }

    public Vacinaçao(String idVacinação, String descVacinação) {
        this.idVacinação = idVacinação;
        this.descVacinação = descVacinação;
    }

    public String getIdVacinação() {
        return idVacinação;
    }

    public void setIdVacinação(String idVacinação) {
        this.idVacinação = idVacinação;
    }

    public String getDescVacinação() {
        return descVacinação;
    }

    public void setDescVacinação(String descVacinação) {
        this.descVacinação = descVacinação;
    }

    public char getEfeitoColateral() {
        return efeitoColateral;
    }

    public void setEfeitoColateral(char efeitoColateral) {
        this.efeitoColateral = efeitoColateral;
    }
    
    public void selTipoVacinação () {
        
    }
}
