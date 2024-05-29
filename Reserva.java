import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva(Cliente cliente, Quarto quarto, Date dataEntrada, Date dataSaida){
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    // get e set do cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    // get e set do quarto
    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
        
        // get e set da entrada do cliente no quarto
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
       
        // get e set da saida do cliente do quarto
    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "** Reserva ** Cliente: " + cliente.getNome() + ", Quarto: " + quarto.getNumero() +
               ", Data de Entrada: " + dataEntrada + ", Data de Saída: " + dataSaida;
    }
}
