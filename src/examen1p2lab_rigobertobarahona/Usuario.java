package examen1p2lab_rigobertobarahona;

import java.util.ArrayList;

public class Usuario {
    private String nameU;
    private int ID;
    private String pass;
    private ArrayList<Personaje> personaje = new ArrayList();


    public String getNameU() {
        return nameU;
    }
   public void setName(String nameU) {
        this.nameU = nameU;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Personaje> getPersonaje() {
        return personaje;
    }

    public void setPersonaje(ArrayList<Personaje> personaje) {
        this.personaje = personaje;
    }
    public Usuario(){        
    }
    
    public Usuario(String nameU, int ID, String pass, ArrayList<Personaje> personaje) {
        this.nameU = nameU;
        this.ID = ID;
        this.pass = pass;
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nameU=" + nameU + ", ID=" + ID + ", pass=" + pass + ", personaje=" + personaje + '}';
    }
    
    
}
