import java.util.Scanner;

public class Aluno extends Pessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        System.out.println("digite o nome");
        pessoa.nome = scan.next();
        System.out.println("digite o CPF");
        pessoa.cpf = scan.next();
        System.out.println("digite a idade");
        pessoa.idade = scan.nextInt();
        System.out.println("digite a data de nascimento");
        pessoa.dataDeNascimento = scan.next();
        System.out.println("digite o sexo");
        pessoa.sexo = scan.next();
        System.out.println("digite a cidade de nascimento");
        pessoa.cidadeDeNascimento = scan.next();

        aluno.nome = pessoa.nome;
        aluno.cpf = pessoa.cpf;
        aluno.idade = pessoa.idade;
        aluno.dataDeNascimento = pessoa.dataDeNascimento;
        aluno.sexo = pessoa.sexo;
        aluno.cidadeDeNascimento = pessoa.cidadeDeNascimento;


                System.out.println(pessoa);
        System.out.println("-------------------");
        System.out.println(aluno);


    }

}


//Crie uma classe Pessoa com os atributo nome, cpf, idade, data nascimento,
// sexo, cidade de nascimento, crie uma classe aluno, que recebe os mesmos parametros da classe Pessoa
// insira os dados via teclado
// e mostre os dados das duas classes
