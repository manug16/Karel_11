/**
 * An algorithm that writes Mr. Torbert's Student ID number: 064420
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display;
import edu.fcps.Digit; 

public class Lab11 {
	 
	 public static void main(String[] args) {
    Display.openWorld("maps/.map");
	 Display.setSize(36, 32);
	 Display.setSpeed(10);
    Digit first = new Zero(1,9);
    Digit second = new Six(7,9);
    Digit third = new Four(13,9);
    Digit fourth = new Four(19,9);
    Digit fifth = new Two(25,9);
    Digit sixth = new Zero(31,9);
    
    first.display();
    second.display();
    third.display();
    fourth.display();
    fifth.display();
    sixth.display();
	 }
	 
 }
