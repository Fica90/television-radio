/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author qa-prepodne
 */
public class Radio {

    private double fmFrequency;
    private int amFrequency;
    private char band;

    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    public double getFmFrequency() {
        return this.fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return this.amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return this.band;
    }

    public void setBand(char band) {
        this.band = band;
    }

    public void showData() {
        System.out.println("Trenutna FM frkvencija je: " + getFmFrequency());
        System.out.println("Trenutni AM frkvencija je: " + getAmFrequency());
        System.out.println("radio je na frkvenciji: " + getBand());
        System.out.println();
    }
}
