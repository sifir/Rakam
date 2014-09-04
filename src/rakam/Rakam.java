/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakam;
/**
 *
 * @author Dario
 */
import javax.swing.*;
public class Rakam  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CREAR PERSONAJES
        int str = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar STR para P1"));
        int agi = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar AGI para P1"));
        int inte = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar INT para P1"));
        int main = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar Main Stat para P1"));
        Pj player1 = new Pj(str,agi,inte,main);
        Pj player2 = new Pj(5,5,5,1);
        
        
        // PLAYER 1------
        int p1LUK;
        int p1HP;
        int p1MP;        
        float p1ARM;
        int p1MGR;
        int p1ATK;
        int p1DMG;
        int p1STR;
        int p1AGI;
        int p1INT;
        int p1Main;
        String p1Class;
        
        //MOSTRAR LUK
        p1LUK = player1.getLUK();
        Integer.toString(p1LUK);
        System.out.println("LUK " + Math.round(p1LUK));
        
        //MOSTRAR HP
        p1HP = player1.getHP();
        Integer.toString(p1HP);
        System.out.println("HP " + Math.round(p1HP));
        
        //MOSTRAR MP
        p1MP = player1.getMP();
        Integer.toString(p1MP);
        System.out.println("MP " + Math.round(p1MP));
        
        //MOSTRAR ARM
        p1ARM = player1.getARM();
        Float.toString(p1ARM);
        System.out.println("ARM " + Math.round(p1ARM));
        
        //MOSTRAR MGR
        p1MGR = player1.getMGR();
        Integer.toString(p1MGR);
        System.out.println("MGR " + Math.round(p1MGR));
        
        //MOSTRAR ATK
        p1ATK = player1.getATK();
        Integer.toString(p1ATK);
        System.out.println("ATK " + Math.round(p1ATK));
        
        //MOSTRAR DMG
        p1DMG = player1.getDMG();
        Integer.toString(p1DMG);
        System.out.println("DMG " + Math.round(p1DMG));
        
        //MOSTRAR STR
        p1STR = player1.getSTR();
        Integer.toString(p1STR);
        System.out.println("STR " + Math.round(p1STR));
        
        //MOSTRAR AGI
        p1AGI = player1.getAGI();
        Integer.toString(p1AGI);
        System.out.println("AGI " + Math.round(p1AGI));
        
        //MOSTRAR INT
        p1INT = player1.getINT();
        Integer.toString(p1INT);
        System.out.println("INT " + Math.round(p1INT));
        
        //MOSTRAR main
        p1Main =  Math.round(player1.getMain()) ;
                
        if (p1Main ==1) {
            p1Class = "Str";
        }
        if (p1Main ==2) {
            p1Class = "Agi";
        } else {
            p1Class="Int";
        }
        System.out.println("Main stat " + p1Class);
        
        // PLAYER 2------
        int p2LUK;
        int p2HP;
        int p2MP;        
        float p2ARM;
        int p2MGR;
        int p2ATK;
        int p2DMG;
        int p2STR;
        int p2AGI;
        int p2INT;
        int p2Main;
        String p2Class;
        
        //MOSTRAR LUK
        p2LUK = player2.getLUK();
        Integer.toString(p2LUK);
        System.out.println("LUK " + Math.round(p2LUK));
        
        //MOSTRAR HP
        p2HP = player2.getHP();
        Integer.toString(p2HP);
        System.out.println("HP " + Math.round(p2HP));
        
        //MOSTRAR MP
        p2MP = player2.getMP();
        Integer.toString(p2MP);
        System.out.println("MP " + Math.round(p2MP));
        
        //MOSTRAR ARM
        p2ARM = player2.getARM();
        Float.toString(p2ARM);
        System.out.println("ARM " + Math.round(p2ARM));
        
        //MOSTRAR MGR
        p2MGR = player2.getMGR();
        Integer.toString(p2MGR);
        System.out.println("MGR " + Math.round(p2MGR));
        
        //MOSTRAR ATK
        p2ATK = player2.getATK();
        Integer.toString(p2ATK);
        System.out.println("ATK " + Math.round(p2ATK));
        
        //MOSTRAR DMG
        p2DMG = player2.getDMG();
        Integer.toString(p2DMG);
        System.out.println("DMG " + Math.round(p2DMG));
        
        //MOSTRAR STR
        p2STR = player2.getSTR();
        Integer.toString(p2STR);
        System.out.println("STR " + Math.round(p2STR));
        
        //MOSTRAR AGI
        p2AGI = player2.getAGI();
        Integer.toString(p2AGI);
        System.out.println("AGI " + Math.round(p2AGI));
        
        //MOSTRAR INT
        p2INT = player2.getINT();
        Integer.toString(p2INT);
        System.out.println("INT " + Math.round(p2INT));
        
        //MOSTRAR main
        p2Main =  Math.round(player2.getMain()) ;
                
        if (p2Main ==1) {
            p2Class = "Str";
        }
        if (p2Main ==2) {
            p2Class = "Agi";
        } else {
            p2Class="Int";
        }
        System.out.println("Main stat " + p2Class);
        
        double ataque;
        //ATAQUE
        ataque = player1.ataque();
        System.out.println("Bulbasor ataco por " + ataque);
    }
    
}
