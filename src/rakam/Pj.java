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
        float LUK;
        float maxHP;
        float maxMP; 
        float ARM;
        float MGR;
        float ATK;
        float DMG;
        float HP;
        float MP;
        float STR;
        float AGI;
        float INT;
        float main;
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
        
    public float[] getPj() {
            float[] pj;
            
            pj = new float[13];
            pj[0]=STR;
            pj[1]=AGI;
            pj[2]=INT;
            pj[3]=LUK;
            pj[4]=maxHP;
            pj[5]=maxMP;
            pj[6]=ARM;
            pj[7]=MGR;
            pj[8]=ATK;
            pj[9]=DMG;
            pj[11]=HP;
            pj[12]=MP;
            pj[13]=main;
            return pj;
        }

        //COMER DAÑO
        public float HPremove (float dmg, float hp) {
            HP = HP - dmg;

            return HP;
        }

//        //ATACAR
//        public float ataque (float dmg) {
//            float dmg = DMG;
//
//            return dmg;
//        }
    }
