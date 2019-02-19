package no.hvl.dat109;

import java.util.Random;

public class Kopp {
    private Integer id;
    private Integer sum;
    private Terning t;


    /**
     * oppretter en kopp med sum 0 og terning uten verdi.
     */
    public Kopp() {
        sum = 0;
        t = null;
    }

    /**
     * Triller alle terningene
     * @return summen av alle terningene
     */
    public int trill(){
        Random rand = new Random();
        int i = 0;
        while (i != 2) {
            t.setVerdi(rand.nextInt(6) + 1);
            sum += t.getVerdi();
            i++;
        }
        return sum;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSum() {
        return sum;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
