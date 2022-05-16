public class Pessoa {

    // nome, cpf, idade, data nascimento, sexo, cidade de nascimento
    String nome;
    String cpf;
    int idade;
    String dataDeNascimento;
    String sexo;
    String cidadeDeNascimento;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", idade=" + idade +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cidadeDeNascimento='" + cidadeDeNascimento + '\'' +
                '}';
    }
}

