package br.edu.ifsp.list01;
import java.util.Scanner;
/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex06 capacidadePintura = new Ex06();
        double[] inputs = new double[4];
        for(int i = 0; i< 4; i++) inputs[i] = scanner.nextDouble();
        System.out.println(capacidadePintura.compute(inputs[0], inputs[1], inputs[2], inputs[3]));
    }

    String compute(double l, double a, double c, double m) {
        String output = null;
        double area = l*a, custo;
        int qtdLatas = (int)Math.ceil(area/m);
        custo = qtdLatas*c;
        output = String.format("%d %.2f", qtdLatas, custo);
        return output;
    }
}
