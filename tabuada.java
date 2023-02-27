ackage tabuadaatualizada;
import javax.swing.JOptionPane;
/**autores:
 * Allan Fernandes
 * João Marques
 * Rafael Matos
 */
public class TabuadaAtualizada {

    public static void main(String[] args) {
        Operacao operacao = new Operacao();               
        String r="";
        String temp;
        do{
            temp = JOptionPane.showInputDialog(null, "Digite um Número","Número",1);
        }while(temp.matches("[a-zA-Z]+"));
        int n= Integer.parseInt(temp);
        do{
            temp = JOptionPane.showInputDialog(null, "1 - Adição \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n\n","Operador Matemático",1);
        }while(temp.matches("[a-zA-Z]+"));
        int o=Integer.parseInt(temp);
        for (int c=1;c<11;c++){
            switch(o){
                case 1:
                    r+= operacao.adicao(n,c);
                    break;
                case 2:
                    r+= operacao.subtracao(n, c);
                    break;
                case 3:
                    r+= operacao.multiplicacao(n, c);
                    break;
                case 4:
                    r+= operacao.divisao(n, c);
                    break;
            }                        
        }
        JOptionPane.showMessageDialog(null, r, "Tabuada", 1);
          
    }
    
}
