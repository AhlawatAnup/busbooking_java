/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busbooking;

/**
 *
 * @author anupa_000
 */
public class BusBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  LogNreg l1=new LogNreg();
      // l1.setVisible(true);
       
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogNreg().setVisible(true);
            }
        });
    }
    
}
