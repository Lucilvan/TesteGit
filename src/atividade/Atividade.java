package atividade;

import javax.swing.JOptionPane;

public class Atividade {
            
    public static void main(String[] args) {
        int opcao, qtdMeia = 0, qtdInteiro = 0;
          
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(":::Cinema Senac:::\n"
                    + "Qual o tipo de bilhete deseja\n"
                    + "1 - Inteira \n 2 - Meio \n 0 - Sair \n Escolha uma das opçoes acima:"));
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
