public abstract class Funcionario {
    private String nome;
    private int idade;
    private int cpf;
    private String email;

    public Funcionario(String nome,int idade, int cpf, String email){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    abstract double calcularSalario();
    
}
