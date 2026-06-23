public class Empresa {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Gerente("Carlos", 8000);
        Funcionario funcionario2 = new Desenvolvedor("Ana", 5000);

        funcionario1.calcularBonus();
        System.out.println();

        funcionario2.calcularBonus();
    }
}

abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void calcularBonus();
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        double bonus = getSalario() * 0.20;
        System.out.println("Cargo: Gerente");
        System.out.println("Nome: " + getNome());
        System.out.println("Bônus: " + bonus);
    }
}

class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        double bonus = getSalario() * 0.10;
        System.out.println("Cargo: Desenvolvedor");
        System.out.println("Nome: " + getNome());
        System.out.println("Bônus: " + bonus);
    }
}
