public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    @Override
    public String toString() {
        return "Cliente: " +getNome() + ", CPF: " + getCpf() + ", Endereço: " +getEndereco();
    }
}
