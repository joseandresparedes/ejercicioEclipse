package ejercicioEclipse;

import java.util.*;

public class SyntaxError {
    public static void printString() {
	    String str = "Hola, que tal?";
	    Random rand = new Random();
	    for (int i = 0; i < 3; i++){
	        System.out.println(str);		
	    }
    }
    public static void main(String args[]) {
        printString();
    }
}
