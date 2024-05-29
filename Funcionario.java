public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(String nome, String cpf, String endereco, String cargo){
        super(nome, cpf, endereco);
        this.cargo = cargo;
    }

    // get e set do cargo
    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    // over para sobreescrever os dados do funcionario
    @Override
    public String toString() {
        return "Funcionário: " +getNome() + ", CPF: " + getCpf() + ", Endereço: " + getEndereco() + ", Cargo: " + cargo;
    }
}
