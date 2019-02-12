package no.hvl.dat109;

import java.util.Random;

public class Kopp {
    private Integer id;
    private Integer sum;
    private Terning t1;
    private Terning t2;


    public Kopp(Integer id, Integer sum, Terning t1, Terning t2) {
        this.id = id;
        this.sum = sum;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int trill(){
        Random rand = new Random();
        t1.setVerdi(1 + rand.nextInt(6));
        t2.setVerdi(1 + rand.nextInt(6));
        sum = t1.getVerdi() + t2.getVerdi();
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

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Terning getT1() {
        return t1;
    }

    public void setT1(Terning t1) {
        this.t1 = t1;
    }

    public Terning getT2() {
        return t2;
    }

    public void setT2(Terning t2) {
        this.t2 = t2;
    }

}
