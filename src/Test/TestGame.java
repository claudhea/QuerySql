/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.awt.Color;
import model.Sel;
import model.Tempat;
import view.GameFrame;
import view.TempatPanel;

/**
 *
 * @author basisb21db
 */
public class TestGame {

    public static void main(String[] args) {
        // buat 1 sel
        Sel sel = new Sel(1,1 ,20,20, '@', Color.RED);
        // buat 1 tempat dan tambahkan sel ke tempat
        Tempat tempat = new Tempat();
        tempat.tambahSel(sel);
        // Set ukuran tempat
        Tempat.batasKanan=600;
        Tempat.batasBawah=400;
        // buat tempatPanel dan tambahkan tempat ke tempatPanel
        TempatPanel tempatPanel = new TempatPanel();
        tempatPanel.setTempat(tempat);
        // buat gameFrame dan tambahkan tempatPanel ke gameFrame
        GameFrame game = new GameFrame("My Game",tempatPanel);
    }
    
}
