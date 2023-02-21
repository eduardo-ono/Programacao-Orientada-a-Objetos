&nbsp;

<h1 align="center">Construtores</h1>

<h4 align="center">Prof. Eduardo Ono</h4>

&nbsp;

## Definição

* Um construtor é um tipo especial de método que é automaticamente executado quando uma classe é instanciada.

* Toda classe possui um construtor padrão, que está implícito na implementação da classe:

```java
public class NomeDaClasse {
    // Construtor padrão
    NomeDaClasse() {
    }
}
```

* Exemplo de construtor personalizado:

```Java
public class Paciente {
    private String nome;
    private double peso; // em kg
    private double altura; // em metros
    private double imc;

    // Construtores

    Paciente() { } // Construtor padrão

    Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        if (peso > 0 && altura > 0) {
            this.imc = peso / (altura * altura);
        }
    }

    // Métodos

    public double getImc() { return this.imc; }
}
```

```java
public class Main {
    public static void main(String args[]) {
        Paciente paciente1 = new Paciente("Fulano de Tal", 83, 1.78);
        System.out.println("IMC = " + paciente1.getImc());
    }
}
```

&nbsp;

