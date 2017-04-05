package dip;

public class Dipendente{

    private String matricola;
    private float stipendio, straordinario;

    public Dipendente(String matricola, float stipendio, float straordinario) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public float getStipendio() {
        return stipendio;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }

    public float getStraordinario() {
        return straordinario;
    }

    public void setStraordinario(float straordinario) {
        this.straordinario = straordinario;
    }

    public float paga(int ore) {
        return getStipendio() + getStraordinario() * ore;
    }

    @Override
    public String toString() {
        return "Dipendente{" + "matricola=" + matricola + ", stipendio=" + stipendio + ", straordinario=" + straordinario + '}';
    }
    
    public void  stampa(){
        System.out.println(this);
    }

    
    public static void main(String[] args) {
        Dipendente d = new Dipendente("123", 1000, 20);
        d.stampa();
        System.out.println("paga per 3 ore straordinario:"+ d.paga(3));
    }
}

