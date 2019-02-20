package no.hvl.dat109;

import java.util.*;

public class TerningSpill {
    private Integer id;
    private ArrayList<Spiller> spillere;
    private Kopp kopp;
    private int antallSpillere;
    private boolean iGang;


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
        this.iGang = false;
    }
    /**
     * Oppretter en ny spiller til tabellen med spillere.
     * @param navn til spilleren
     */
    public void leggTilSpiller(String navn){
        spillere.add(new Spiller(navn));
    }

    /**
     * Setter i gang spillet med å trille terningene på alle spillere til det ikke er noen igjen. Så returnere spilleren som vant.
     */
    public void spill(){
        for(Spiller s: spillere) {
            s.spill(kopp);
        }
        System.out.println(getVinner() + " vant med sum: " + getVinner().getVerdi());
    }

    /**
     * sammenligner alle spillere med sum/verdi
     * @return spilleren med høyst verdi, også vinneren.
     */
    public Spiller getVinner(){
        Spiller spiller = null;
        int current = 0;
        int storst = 0;
        for(Spiller s: spillere){
            current = s.getVerdi();
            if(current > storst){
                storst = current;
                spiller = s;
            }
        }
        return spiller;
    }
}
