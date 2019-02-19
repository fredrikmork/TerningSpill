package no.hvl.dat109;

import java.util.ArrayList;

public class TerningSpill {
    private Integer id;
    private ArrayList<Spiller> spillere;
    private Kopp kopp;
    private int antallSpillere;


    /**
     * setter opp et nytt terningspill med et gitt antall spillere.
     * @param id
     * @param antallSpillere
     */
    public TerningSpill(Integer id, int antallSpillere){
        this.id = id;
        this.spillere = new ArrayList<>();
        this.kopp = new Kopp();
        this.antallSpillere = antallSpillere;
    }
    /**
     * Oppretter en ny spiller til tabellen med spillere.
     * @param navn til spilleren
     */
    public void leggTilSpiller(String navn){
        spillere.add(new Spiller(navn));
    }

    public void spill(){

    }
    public Spiller getVinner(){
        return;
    }
}
