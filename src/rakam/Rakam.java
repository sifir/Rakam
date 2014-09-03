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
        float[] stats;
        stats = player1.getPj();
        
        System.out.println(stats.toString());
        
    }
    
}
