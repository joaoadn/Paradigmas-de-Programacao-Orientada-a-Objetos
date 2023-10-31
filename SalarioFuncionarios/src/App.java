public class App {
    public static void main(String[] args) throws Exception {
        FuncionarioAssalariado funcionario = new FuncionarioAssalariado("Nome", 30, 123456, "email@example.com", 3000);
        double salario = funcionario.calcularSalario();
        System.out.println("Salário do funcionário assalariado: " + salario);

        FuncionarioHorista funcionario2 = new FuncionarioHorista("Nome", 35, 654321, "email@example2.com", 400, 20);
        double salario2 = funcionario2.calcularSalario();
        System.out.println("Salário do funcionário horista: " + salario2);
    }
}
