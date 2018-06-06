
package main;

import media.Radio;
import media.Television;


public class Main {


    public static void main(String[] args) {
     
        Television myTelevision = new Television ();
        myTelevision.showData();
        
        myTelevision.setcurrentProgram(1);
        myTelevision.setVolume(8);
        myTelevision.showData();
        
        Radio myRadio = new Radio (98.6, 550, 'A');
        myRadio.showData();
        
    }
    
}
