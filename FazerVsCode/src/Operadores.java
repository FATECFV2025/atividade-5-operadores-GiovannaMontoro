public class Operadores {
    //Operações Aritméticas
    public float adicao(float n1, float n2){
        return n1+n2;
    }
    public float subtracao(float n1, float n2){
        return n1-n2;
    }
    public float multiplicacao(float n1, float n2){
        return n1*n2;
    }
    public float divisao(float n1, float n2){
        return n1/n2;
    } 
    //Operações de Atribuição
    public void Atribuicao(int n1, int n2) {
        System.out.println("Valor inicial do primeiro número: " + n1);
    n1 += n2;
        System.out.println("Resultado do primeiro número += ao segundo número: " + n1);
    n1 -= n2; 
        System.out.println("Resultado do primeiro número -= ao segundo número: " + n1);
    n1 *= n2;
        System.out.println("Resultado do primeiro número *= ao segundo número:: " + n1);
    n1 /= n2;
        System.out.println("Resultado do primeiro número /= ao segundo número: " + n1);
    n1 %= n2;
        System.out.println("Resultado do primeiro número %= ao segundo número: " + n1);
    }
    //Operações Lógicas
    public void Logicos(float n1, float n2) {
    if (n1 > 0 && n2 > 0) {
        System.out.println("Ambos são números positivos");
    } else {
        System.out.println("Um dos números não é positivo");
    }    
    if (n1 % 2 == 0 || n2 % 2 == 0) {
        System.out.println("Um dos números é par");
    } else {
        System.out.println("Não há um número que seja par");
    }
    if (n1 != n2) {
        System.out.println("Os números são distintos");
    } else {
        System.out.println("Os números são idênticos");
    }
    }
    //Operações de Comparação
    public void Comparacao(float n1, float n2) {
    System.out.println("Comparando o primeiro número e o segundo número");
    if (n1 == n2) {
        System.out.println("Os números são idênticos");
    } else {
        System.out.println("Os números são distintos");
    }
    if (n1 > n2) {
        System.out.println("o primeiro número é maior que o segundo numero");
    }
    if (n1 < n2) {
        System.out.println("O primeiro número é menor que o segundo número");
    }
    if (n1 >= n2) {
        System.out.println("O primeiro número é maior ou igual ao segundo número");
    }
    if (n1 <= n2) {
        System.out.println("O primeiro número é menor ou igual ao segundo número");
    }
  }
}
    
