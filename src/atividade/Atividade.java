package atividade;

import javax.swing.JOptionPane;

public class Atividade {
            //sdgs
    public static void main(String[] args) {
        
        int teste; int teste1; int teste2; int teste3;   
        do{
            
            switch(opcao){
                case 1:
                    qtdInteiro++;
                    break;
                case 2:
                    qtdMeia++;
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, ":::Bilhetes Vendido:::\n"
                            + "Inteiro: "+qtdInteiro+"\n Meia: "+qtdMeia);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida!");
                    break;
            }
        }while(opcao!=0 || ((qtdInteiro+qtdMeia)==30));
    }
    
}
