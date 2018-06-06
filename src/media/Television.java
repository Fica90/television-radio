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
public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = true;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getcurrentProgram() {
        return this.currentProgram;
    }

    public void setcurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean getturnOn() {
        return this.turnOn;
    }

    public void setturnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void showData() {
        System.out.println("Jacina televizora je: " + getVolume());
        System.out.println("Trenutni program je: " + getcurrentProgram());
        System.out.println("Televizor je ukljucen: " + getturnOn());

    }
}
