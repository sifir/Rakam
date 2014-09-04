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
public class Pj {
    
    //DECLARACION ======D
    final private int STR;
    private int AGI;
    private int INT;
    private int LUK;
    private int maxHP;
    final private int maxMP; 
    private int MGR;
    final private int ATK;
    private int DMG;
    private int HP;
    final private int MP;
    final private float ARM;
    private int main;

public Pj(int fuerza, int agilidad, int inteligencia, int principal) {

    //CREACION DEL PERSONAJE ======D

    this.STR = fuerza;
    //maxHP
    this.HP = agilidad * 19;    
    //maxMP 
    this.maxMP = inteligencia * 13;    
    //ARM  
    this.ARM = AGI * (int) 0.14;    
    //ATK    
    this.ATK = AGI;    
    //MP    
    this.MP = maxMP;    
    //DMG
    if (principal == 1) {
        this.DMG = STR + DMG;
        this.main = 1;
    }
    if (principal == 2) {
        this.DMG = AGI + DMG;
        this.main = 2;
    } else {
        this.DMG = INT + DMG;
        this.main = 3;
    }
}

    //COMER DAÑO
    public int HPremove (int dmg, int hp) {
        HP = getHP() - dmg;

        return getHP();
    }

    //ATACAR
    public double ataque () {
    double random = (Math.random()*10) + DMG;
        return random;
    }

    /**
     * @return the LUK
     */
    public int getLUK() {
        return LUK;
    }

    /**
     * @return the maxHP
     */
    public int getMaxHP() {
        return maxHP;
    }

    /**
     * @return the maxMP
     */
    public int getMaxMP() {
        return maxMP;
    }

    /**
     * @return the ARM
     */
    public float getARM() {
        return ARM;
    }

    /**
     * @return the MGR
     */
    public int getMGR() {
        return MGR;
    }

    /**
     * @return the ATK
     */
    public int getATK() {
        return ATK;
    }

    /**
     * @return the DMG
     */
    public int getDMG() {
        return DMG;
    }

    /**
     * @return the HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * @return the MP
     */
    public int getMP() {
        return MP;
    }

    /**
     * @return the STR
     */
    public int getSTR() {
        return STR;
    }

    /**
     * @return the AGI
     */
    public int getAGI() {
        return AGI;
    }

    /**
     * @return the INT
     */
    public int getINT() {
        return INT;
    }

    /**
     * @return the main
     */
    public int getMain() {
        return main;
    }
    }
