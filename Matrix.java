import java.util.Scanner;

public class Matrix {
    // TODO
    // Matrix als Array
    // mul auf x,y * y,z achten!

    private int zeilen;
    private int spalten;
    private float matrix[][];
    
    // ------------------ Konstruktoren ------------------

    Matrix () {

    }

    Matrix (int zeilen, int spalten) {
        this.zeilen = zeilen;
        this.spalten = spalten;
    }

    // ------------------ set / get Methoden ------------------
    
    void setArray () {
        Scanner sc = new Scanner(System.in);
        for (int zeile = 0; zeile < zeilen; zeile++) {
            for (int spalte = 0; spalte < spalten; spalte++) {
                System.out.println("Bitte geben Sie einen Wert für Zeile "
                         + zeile+1 +" Spalte " + spalte+1 + " an.");
                matrix[zeile][spalte] = sc.nextFloat();
            }
        }
        
    }
    
    void setZeilen (int zeilen) {
        ;
    }

    void setSpalten (int spalten) {
        ;
    }

    int getZeilen () {
        return zeilen;
    }

    public int getSpalten () {
        return spalten;
    }

    // ------------------ Methoden ------------------


    boolean equals (Matrix m2) {
        return true;
    }

    public Matrix add (Matrix m2) {
        return m2;
    }

    public Matrix mulSkalar (int skalar) {
        return this;
    }

    public Matrix mulMatrix (Matrix m2) {
        return m2;
    }

    public String toString() {
        return "";
    }
}
