package entities;

import entidade_enums.MetodosAbstratos_Color;

public class MetodosAbstratos_Circulo extends MetodosAbstratos_shape {

	private Double radius;

	public MetodosAbstratos_Circulo() {
		super();
	}

	public MetodosAbstratos_Circulo(MetodosAbstratos_Color metodosAbstratos_Color, Double radius) {
		super(metodosAbstratos_Color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	//retorna fun??o do raio ao quadrado
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}