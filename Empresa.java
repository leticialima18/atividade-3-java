public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente(nome: "Carlos", salario: 8000);
        Funcionario funcionario2 = new Desenvolvedor(nome: "Ana", salario: 5000);

        funcionario1.calcularBonus();
        System.out.println();

        funcionario2.calcularBonus();
    }
}

    abstract class Funcionario{

        private String nome;
        private double salario;

        public Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;

        }
        public String getNome(){
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
        public abstract void calcularBonus();
} 

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calcularBonus(){
        double bonus = getSalario() * 0.20;
        System.out.println(x: "Cargo: Gerente");
    }
}
