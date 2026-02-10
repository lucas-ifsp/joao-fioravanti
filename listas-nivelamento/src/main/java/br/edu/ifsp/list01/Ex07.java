package br.edu.ifsp.list01;
import java.util.Scanner;
/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total
    com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada    	Saída
    100         75.00
    1.50
    1.25
    50
    Entrada    	Saída
    100         187.50
    1.50
    1.25
    150
*/
public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex07 calculoCorrida = new Ex07();
        double[] inputs = new double[4];
        for(int i = 0; i<4; i++) inputs[i] = scanner.nextDouble();
        System.out.println(calculoCorrida.compute((int)inputs[0], inputs[1], inputs[2], inputs[3]));

    }

    double compute(int x, double v1, double v2, double a) {
        double output = 0;
        if(a>x){
            output = v2*a;
        }
        else{
            output = v1*a;
        }

        return output;
    }
}
