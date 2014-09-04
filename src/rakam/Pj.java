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
        private float LUK;
        private float maxHP;
        private float maxMP; 
        private float ARM;
        private float MGR;
        private float ATK;
        private float DMG;
        private float HP;
        private float MP;
        private float STR;
        private float AGI;
        private float INT;
        private float main;
    public Pj(float STR, float AGI, float INT, float main) {
              
        //CREACION DEL PERSONAJE ======D
        //maxHP
        HP = STR * 19;    
        //maxMP 
        maxMP = INT * 13;    
        //ARM  
        ARM = AGI * (float) 0.14;    
        //ATK    
        ATK = AGI;    
        //MP    
            MP = maxMP;    
        //DMG
        if (main == 1) {
            DMG = STR;
        }
        if (main == 2) {
            DMG = AGI;
        } else {
            DMG = INT;
        }
    }

        //COMER DAÑO
        public float HPremove (float dmg, float hp) {
            HP = getHP() - dmg;

            return getHP();
        }

//        //ATACAR
//        public float ataque (float dmg) {
//            float dmg = DMG;
//
//            return dmg;
//        }

    /**
     * @return the LUK
     */
    public float getLUK() {
        return LUK;
    }

    /**
     * @return the maxHP
     */
    public float getMaxHP() {
        return maxHP;
    }

    /**
     * @return the maxMP
     */
    public float getMaxMP() {
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
    public float getMGR() {
        return MGR;
    }

    /**
     * @return the ATK
     */
    public float getATK() {
        return ATK;
    }

    /**
     * @return the DMG
     */
    public float getDMG() {
        return DMG;
    }

    /**
     * @return the HP
     */
    public float getHP() {
        return HP;
    }

    /**
     * @return the MP
     */
    public float getMP() {
        return MP;
    }

    /**
     * @return the STR
     */
    public float getSTR() {
        return STR;
    }

    /**
     * @return the AGI
     */
    public float getAGI() {
        return AGI;
    }

    /**
     * @return the INT
     */
    public float getINT() {
        return INT;
    }

    /**
     * @return the main
     */
    public float getMain() {
        return main;
    }
    }
