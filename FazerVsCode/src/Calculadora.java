import java.util.Scanner;

public class Calculadora {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Operadores op = new Operadores();

    System.out.println("<-----Calculadora----->");
    System.out.print("Digite o primeiro número: ");
    int n1 = sc.nextInt(); 
    System.out.println("Digite o segundo número: ");
    int n2 = sc.nextInt(); 
    System.out.println("O Resultado da soma é: " + op.adicao(n1, n2));
    System.out.println("O Resultado da subtração é: " + op.subtraçao(n1, n2));
    System.out.println("O Resultado da multiplicação é: " + op.multiplicacao(n1, n2));
    System.out.println("O Resultado da divisão é: " + op.divisao(n1, n2));

    op.Atribuicao((int)n1,(int)n2);
    op.Logicos(n1,n2);
    op.Comparacao(n1,n2);
    sc.close();
  }
}