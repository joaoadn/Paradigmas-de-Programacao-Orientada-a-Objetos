public class FuncionarioAssalariado extends Funcionario {
    private int salarioMensal;

    public FuncionarioAssalariado(String nome, int idade, int cpf, String email, int salarioMensal) {
        super(nome, idade, cpf, email);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
    
}

