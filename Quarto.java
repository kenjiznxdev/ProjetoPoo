public class Quarto {
    private int numero;
    private String tipo;
    private double preco;
    private int numeroDePessoas; 

    public Quarto(int numero, String tipo, double preco, int numeroDePessoas){
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
        this.numeroDePessoas = numeroDePessoas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDePessoas(){
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas){
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public String toString() {
        return "** Quarto ** Número: " + numero + ", Tipo: " + tipo + ", Quantidade de Pessoas: " + numeroDePessoas + ", Preço: " + preco;
    }
}
