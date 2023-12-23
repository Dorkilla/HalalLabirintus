/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dorki
 */
public class Oldal {
    String Szoveg;
    int Oldalszam;
    int ElsoLehetoseg;
    String ElsoLehetosegSzoveg;

    public String getElsoLehetosegSzoveg() {
        return ElsoLehetosegSzoveg;
    }

    public String getMasodikLehetosegSzoveg() {
        return MasodikLehetosegSzoveg;
    }
    int MasodikLehetoseg;
    String MasodikLehetosegSzoveg;
    
    public Oldal(String szoveg, int oldalszam, int elso, String elsoLehetosegSzoveg, int masodik, String masodikLehetosegSzoveg) {
        Szoveg = szoveg;
        Oldalszam = oldalszam;
        ElsoLehetoseg = elso;
        ElsoLehetosegSzoveg = elsoLehetosegSzoveg;
        MasodikLehetoseg = masodik;
        MasodikLehetosegSzoveg = masodikLehetosegSzoveg;
    }
    
    public String GetSzoveg() {
        return Szoveg;
    }
    
    public int GetOldalszam() {
        return Oldalszam;
    }
    
    public void SetOldalszam(int oldalszam) {
        Oldalszam = oldalszam;
    }
    
    public int GetElsoLehetoseg() {
        return ElsoLehetoseg;
    }
    
    public int GetMasodikLehetoseg() {
        return MasodikLehetoseg;
    }
}
