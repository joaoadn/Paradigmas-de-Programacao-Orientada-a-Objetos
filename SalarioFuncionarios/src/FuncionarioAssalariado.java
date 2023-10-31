public class FuncionarioAssalariado extends Funcionario {
    private int salarioBruto;

    public FuncionarioAssalariado(String nome, int salarioBruto) {
        super(nome);
        this.salarioBruto = salarioBruto;
    }
    @Override
    public double calcularSalario() {
        return salarioBruto;
    }
    @Override
    public String toString() {
        return super.toString() + "\nSalário Mensal: " + salarioBruto;
    }
    
}

