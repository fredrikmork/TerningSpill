package no.hvl.dat109;

import java.util.Comparator;

public class Spiller {
    private String navn;
    private Integer verdi;


    public Spiller () {
        this.verdi = 0;
    }

    public Spiller(String navn) {
        this.navn = navn;
        this.verdi =  0;
    }

    /**
     *Spiller triller koppen.
     * @param kopp med terningverdier
     */
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
