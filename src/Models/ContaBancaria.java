package Models;
//Encapsulamento
public class ContaBancaria {
    private double Saldo = 555;

    public void Depositar(double valor){
        if (valor > 0) Saldo+=valor;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

}
