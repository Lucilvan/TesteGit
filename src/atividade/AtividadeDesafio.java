package atividade;

import javax.swing.JOptionPane;

public class AtividadeDesafio {
public static void main(String[] args) {
        int opcao, qtdMeia=0, qtdInteiro=0, numColuna=0, numLinha=0, aux=0;
        String lugares[][] = new String[6][5];
        String menu = ":::Cinema Senac:::\n";
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                lugares[i][j]="O";
            }
        } 
        do{
            aux=0;
            menu="";
            menu += ":::Cinema Senac:::\n";
            menu += "   0  1  2  3  4\n";
            for(int i=0; i<6; i++){
                menu+=aux+++" ";
                for(int j=0; j<5; j++){
                    menu+=lugares[i][j]+" ";
                }
                menu+="\n";
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog(":::Cinema Senac:::\n"
                    + "Qual o tipo de bilhete deseja\n"
                    + "1 - Inteira \n 2 - Meio \n 0 - Sair \n Escolha uma das opçoes acima:"));
            switch(opcao){
                case 1:
                    qtdInteiro++;
                    numColuna = Integer.parseInt(JOptionPane.showInputDialog(menu+"\nBilhete Inteiro\nEscolha a coluna desejada"));
                    numLinha = Integer.parseInt(JOptionPane.showInputDialog(menu+"\nBilhete Inteiro\nEscolha a linha desejada"));
                    if(lugares[numColuna][numLinha].equalsIgnoreCase("O")){
                        lugares[numColuna][numLinha]="X";
                    }else{
                        JOptionPane.showMessageDialog(null, "Lugar ocupado!");
                    }
                    break;
                case 2:
                    qtdMeia++;
                    numColuna = Integer.parseInt(JOptionPane.showInputDialog(menu+"\nBilhete Meia\nEscolha a coluna desejada"));
                    numLinha = Integer.parseInt(JOptionPane.showInputDialog(menu+"\nBilhete Meia\nEscolha a linha desejada"));
                    if(lugares[numColuna][numLinha].equalsIgnoreCase("O")){
                        lugares[numColuna][numLinha]="X";
                    }else{
                        JOptionPane.showMessageDialog(null, "Lugar ocupado!");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, ":::Bilhetes Vendido:::\n"
                            + menu+"\n"
                            + "Inteiro: "+qtdInteiro+"\n Meia: "+qtdMeia);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida!");
                    break;
            }
        }while(opcao!=0 || ((qtdInteiro+qtdMeia)==30));
    }    
}
