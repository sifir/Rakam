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
public class Personaje {
    
    float STR=5;
    float AGI=5;
    float INT=5;
    float LUK=5;
    float HPp;
    float MPp; 
    float ARM;
    float MGR;
    float ATK;
    float DMG;
    float rDMG;
    float HP;
    float MP;
    float main=1;

    
    //CREACION DEL PERSONAJE ======D
    private float  calcularHPp(float STR, float HP){    
        HP = HP + (STR * 19);    
        return HP;
    }
    private float calcularMPp(float INT){    
        MPp = INT * 13;    
        return MPp;
    }
    private float calcularARM(float AGI){    
        ARM = AGI * (float) 0.14;    
        return ARM;
    }
    private float  calcularATK(){    
        ATK = ATK + AGI;    
        return ATK;
    }
    
    private float  calcularHP(float HPp){    
        HP = HPp;    
        return HP;
    }
    
    private float  calcularMP(float MPp){    
        MP = MPp;    
        return MP;
    }
    
    private void  calcularMainStat(float main){    
        if (main == 1) {
            DMG = DMG + STR;
        }
        if (main == 2) {
            DMG = DMG + AGI;
        } else {
            DMG = DMG + INT;
        }
    }
        
    //METHODS DEL PERSONAJE ======D
    
    //DAR PERSONAJE
    public Personaje getPj(){
        float[] pj;
        pj = new float[10];
        
        pj[0]=STR;
        pj[1]=AGI;
        pj[2]=INT;
        pj[3]=LUK;
        pj[4]=HPp;
        pj[5]=MPp;
        return pj;
    }
    
    //COMER DAÑO
    public float HPremove (float dmg) {
        HP = HP - dmg;
        
        return HP;
    }
    
    //ATACAR
    public float ataque () {
        float dmg = DMG;
        
        return dmg;
    }
}

