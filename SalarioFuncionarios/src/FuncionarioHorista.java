public class FuncionarioHorista extends Funcionario {
    private int salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, int idade, int cpf, String email, int salarioPorHora, int horasTrabalhadas){
        super (nome,idade,cpf,email);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    double calcularSalario(){
        return salarioPorHora * horasTrabalhadas;
    }
}
