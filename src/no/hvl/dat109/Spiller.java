package no.hvl.dat109;

public class Spiller {
    private String navn;
    private Integer verdi;

    public Spiller(String navn, Integer verdi) {
        this.navn = navn;
        this.verdi = verdi;
    }

    public void spill(Kopp kopp){
        verdi = kopp.trill();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Integer getVerdi() {
        return verdi;
    }

    public void setVerdi(Integer verdi) {
        this.verdi = verdi;
    }
}
