package Models;

 public class Carro extends Veiculo {
    public Long Id;
    public String Modelo;
    public int Ano;
    public String Cor;

    public void ExibirInfo(){
        System.out.println("\u001b[1m id: \u001b[0m" + Id + " \u001b[1m  Modelo: \u001b[0m"+  Modelo  + "\u001b[1m Ano: \u001b[0m" + Ano + "\u001b[1m Cor: \u001b[0m" + Cor);
    }


    @Override
    public void MoverVeiculo() {
        System.out.println("\u001b[1mCarro em movimento\u001b[0m");
        System.out.println("\u001b[1mCarro em alta velocidade\u001b[0m");
        System.out.println("\u001b[1mVruuum\u001b[0m");
    }
}

