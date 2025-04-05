package Models;

public class Fabricante extends ModelosAno{
    public Long Id;
    public String Modelo;
    public int Ano;
    public String Cor;

    @Override
    public void VeiculoDoAno(){
        System.out.println("carro de corrida ABCD");
    }
}
