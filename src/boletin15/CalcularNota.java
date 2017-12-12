
package boletin15;

import javax.swing.JOptionPane;

public class CalcularNota {
    private double nota;
    int boletines = 0;
    
    
    public void probasEscritas(){
        double escrita1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la primera prueba escrita"));
        double escrita2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la segunda prueba escrita"));
        
        double media = (escrita1+escrita2)/2;
        double total = (media*40)/100;
        JOptionPane.showMessageDialog(null, total);
        
        double practica1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la primera prueba escrita"));
        practica1 = (practica1*40)/100;
        
        JOptionPane.showMessageDialog(null, practica1);
        
        double boletins;
        
        for(int i=0;i<17;i++){
            
            int ax = JOptionPane.showConfirmDialog(null,"¿Boletín"+i+" entregado?");
                if(ax == JOptionPane.YES_OPTION){
                    ++boletines;
                }
                
        }JOptionPane.showMessageDialog(null, boletines+" entregados");
    }

}
