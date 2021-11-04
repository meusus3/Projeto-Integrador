package meusus;

public class Exame {
    protected char idExame;
    protected char descExame;
    protected char tipo_Exame;
    public void status () {
        System.out.println("COVID19 " + this.tipo_Exame);
    }

    public Exame(char idExame, char descExame) {
        this.idExame = idExame;
        this.descExame = descExame;
    }

    public char getIdExame() {
        return idExame;
    }

    public void setIdExame(char idExame) {
        this.idExame = idExame;
    }

    public char getDescExame() {
        return descExame;
    }

    public void setDescExame(char descExame) {
        this.descExame = descExame;
    }

    public char getTipo_Exame() {
        return tipo_Exame;
    }

    public void setTipo_Exame(char tipo_Exame) {
        this.tipo_Exame = tipo_Exame;
    }
    
    public void selTipoExame () {
        
    }
}
