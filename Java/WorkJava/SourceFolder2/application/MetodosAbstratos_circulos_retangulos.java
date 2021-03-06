
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade_enums.MetodosAbstratos_Color;
import entities.MetodosAbstratos_Circulo;
import entities.MetodosAbstratos_retangulo;
import entities.MetodosAbstratos_shape;

public class MetodosAbstratos_circulos_retangulos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<MetodosAbstratos_shape> list = new ArrayList<>();

		System.out.print("Entre com o numero de figuras: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape (figura)#" + i + " data:");
			System.out.print("Rectangle or Circle (retangulo ou circulo) (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color(cor) (BLACK/BLUE/RED): ");
			MetodosAbstratos_Color metodosAbstratos_Color = MetodosAbstratos_Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width(largura): ");
				double width = sc.nextDouble();
				System.out.print("Height(altura): ");
				double height = sc.nextDouble();
				list.add(new MetodosAbstratos_retangulo(metodosAbstratos_Color, width, height));
			} else {
				System.out.print("Radius(raio): ");
				double radius = sc.nextDouble();
				list.add(new MetodosAbstratos_Circulo(metodosAbstratos_Color, radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS(?rea das figuras):");
		for (MetodosAbstratos_shape metodosAbstratos_shape : list) {
			System.out.println(String.format("%.2f", metodosAbstratos_shape.area()));
		}

		sc.close();
	}
}
