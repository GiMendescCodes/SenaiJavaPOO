package Models;

public class Carro {
    public String Modelo;
    public int Ano;
    public String Cor;

    public void ExibirInfo(){
        System.out.println("\u001b[1m  Modelo: \u001b[0m"+  Modelo  + "\u001b[1m Ano: \u001b[0m" + Ano + "\u001b[1m Cor: \u001b[0m" + Cor);
    }
}
