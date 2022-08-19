package examen1p2lab_rigobertobarahona;

import java.util.ArrayList;


public class Fortaleza extends Personaje{

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public ArrayList<Arma> getArma() {
        return arma;
    }

    public void setArma(ArrayList<Arma> arma) {
        this.arma = arma;
    }

    public Fortaleza(String nameP, int vida, int escudo, ArrayList<Arma> arma) {
        super(nameP, vida, escudo, arma);
    }
    
}
