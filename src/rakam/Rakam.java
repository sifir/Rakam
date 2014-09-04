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
public class Rakam  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Agite fight = new Agite();
        
        //CREAR PERSONAJES
        Pj player1 = new Pj(5,5,5,1);
        Pj player2 = new Pj(5,5,5,1);
        
        
        // PLAYER 1------
        float p1LUK;
        float p1HP;
        float p1MP;        
        float p1ARM;
        float p1MGR;
        float p1ATK;
        float p1DMG;
        float p1STR;
        float p1AGI;
        float p1INT;
        int p1Main;
        String p1Class;
        
        //MOSTRAR LUK
        p1LUK = player1.getLUK();
        Float.toString(p1LUK);
        System.out.println("LUK " + Math.round(p1LUK));
        
        //MOSTRAR HP
        p1HP = player1.getHP();
        Float.toString(p1HP);
        System.out.println("HP " + Math.round(p1HP));
        
        //MOSTRAR MP
        p1MP = player1.getMP();
        Float.toString(p1MP);
        System.out.println("MP " + Math.round(p1MP));
        
        //MOSTRAR ARM
        p1ARM = player1.getARM();
        Float.toString(p1ARM);
        System.out.println("ARM " + Math.round(p1ARM));
        
        //MOSTRAR MGR
        p1MGR = player1.getMGR();
        Float.toString(p1MGR);
        System.out.println("MGR " + Math.round(p1MGR));
        
        //MOSTRAR ATK
        p1ATK = player1.getATK();
        Float.toString(p1ATK);
        System.out.println("ATK " + Math.round(p1ATK));
        
        //MOSTRAR DMG
        p1DMG = player1.getDMG();
        Float.toString(p1DMG);
        System.out.println("DMG " + Math.round(p1DMG));
        
        //MOSTRAR STR
        p1STR = player1.getSTR();
        Float.toString(p1STR);
        System.out.println("STR " + Math.round(p1STR));
        
        //MOSTRAR AGI
        p1AGI = player1.getAGI();
        Float.toString(p1AGI);
        System.out.println("AGI " + Math.round(p1AGI));
        
        //MOSTRAR INT
        p1INT = player1.getINT();
        Float.toString(p1INT);
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
        float p2LUK;
        float p2HP;
        float p2MP;        
        float p2ARM;
        float p2MGR;
        float p2ATK;
        float p2DMG;
        float p2STR;
        float p2AGI;
        float p2INT;
        int p2Main;
        String p2Class;
        
        //MOSTRAR LUK
        p2LUK = player2.getLUK();
        Float.toString(p2LUK);
        System.out.println("LUK " + Math.round(p2LUK));
        
        //MOSTRAR HP
        p2HP = player2.getHP();
        Float.toString(p2HP);
        System.out.println("HP " + Math.round(p2HP));
        
        //MOSTRAR MP
        p2MP = player2.getMP();
        Float.toString(p2MP);
        System.out.println("MP " + Math.round(p2MP));
        
        //MOSTRAR ARM
        p2ARM = player2.getARM();
        Float.toString(p2ARM);
        System.out.println("ARM " + Math.round(p2ARM));
        
        //MOSTRAR MGR
        p2MGR = player2.getMGR();
        Float.toString(p2MGR);
        System.out.println("MGR " + Math.round(p2MGR));
        
        //MOSTRAR ATK
        p2ATK = player2.getATK();
        Float.toString(p2ATK);
        System.out.println("ATK " + Math.round(p2ATK));
        
        //MOSTRAR DMG
        p2DMG = player2.getDMG();
        Float.toString(p2DMG);
        System.out.println("DMG " + Math.round(p2DMG));
        
        //MOSTRAR STR
        p2STR = player2.getSTR();
        Float.toString(p2STR);
        System.out.println("STR " + Math.round(p2STR));
        
        //MOSTRAR AGI
        p2AGI = player2.getAGI();
        Float.toString(p2AGI);
        System.out.println("AGI " + Math.round(p2AGI));
        
        //MOSTRAR INT
        p2INT = player2.getINT();
        Float.toString(p2INT);
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
    }
    
}
