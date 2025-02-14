/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas

válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
AQUI O PROBLEMA É RESOLVIDO COM ORIENTAÇÃO A OBJETOS*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ComPOOEMetodos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Triangle x, y;
		x = new Triangle(); /* instanciando (criando) os objetos */
		y = new Triangle();

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();

			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();

			double areaX = x.area(); /* a variavel areaX recebe o objeto x com o metodo area() */
			double areaY = y.area();

			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);

			if (areaX > areaY) {
				System.out.println("Larger area: X");
			} else {
				System.out.println("Larger area: Y");
			}
		}
	}
}
