package tabuadaatualizada;

public class Operacao {
    
    public String adicao(int x,int y){
        return x +" + " + y + " = " + (x+y)+"\n";
    }
    public String subtracao(int x,int y){
        return (x+y)+ " - " + x + " = " + y +"\n";
    }
    public String multiplicacao(int x,int y){
        return x +" x " + y + " = " + (x*y)+"\n";
    }
    public String divisao(int x,int y){
        return (x*y)+ " / " + x + " = " + y +"\n";
    }
    
}
