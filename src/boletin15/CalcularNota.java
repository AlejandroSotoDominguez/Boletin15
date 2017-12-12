
package boletin15;

import javax.swing.JOptionPane;

public class CalcularNota {
    private double nota;
    double boletines = 0;
    double boletinesTotales=17;
    int puntuacionBoletines;
    
    public void calcular(){
        double escrita1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la primera prueba escrita"));
        double escrita2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la segunda prueba escrita"));
        
        double media = (escrita1+escrita2)/2;
        double totalEscrita = (media*40)/100;
        
        double practica = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de la prueba práctica"));
        practica = (practica*40)/100;     
        
        for(int i=0;i<=17;i++){
            
            int ax = JOptionPane.showConfirmDialog(null,"¿Boletín "+i+" entregado?");
                if(ax == JOptionPane.YES_OPTION){
                    ++boletines;
                }
                
        }
        if(boletines > ((boletinesTotales*90)/100)){
                    puntuacionBoletines = 2;
                }else if(boletines <= ((boletinesTotales*90)/100) && boletines >= ((boletinesTotales*70)/100)){
                    puntuacionBoletines = 1;
                }else{
                    puntuacionBoletines = 0;
                }
        
        JOptionPane.showMessageDialog(null, "PROBAS TEÓRICAS: "+totalEscrita+"\n"+
          "PROBAS PRÁCTICA: "+practica+"\n"+"BOLETÍNS: "+(int)boletines+" entregados"+"\n"+
          "NOTA TOTAL: "+(totalEscrita+practica+puntuacionBoletines));
    }

}
