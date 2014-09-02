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
    
    int STR;
    int AGI;
    int INT;
    int HPp;
    int MPp; 
    float ARM;
    int MGR;
    int ATK;
    int DMG;
    int rDMG;
    int HP;
    int MP;
    int mainStat;
    
    //CREACION DEL PERSONAJE
    private int  calcularHPp(int STR, int HP){    
        HP = HP + (STR * 19);    
        return HP;
    }
    private int calcularMPp(int INT){    
        MPp = INT * 13;    
        return MPp;
    }
    private float calcularARM(int AGI){    
        ARM = AGI * (float) 0.14;    
        return ARM;
    }
    private int  calcularATK(){    
        ATK = ATK + AGI;    
        return ATK;
    }
    
    private int  calcularHP(int HPp){    
        HP = HPp;    
        return HP;
    }
    
    private int  calcularMP(int MPp){    
        MP = MPp;    
        return MP;
    }
    
    private void  calcularMainStat(int main){    
        switch (main) {
            case 1:DMG= rDMG + STR;
                break;
            case 2:DMG= rDMG + AGI;
                break;
            case 3:DMG= rDMG + INT;
        }
    }
        
    //RESPUESTAS DEL PERSONAJE
    public int HPremove (int dmg) {
        HP = HP - dmg;
        
        return HP;
    }
}
