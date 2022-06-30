package entities;

import entidade_enums.MetodosAbstratos_Color;
//CLASSE ABSTRATA POIS O M�TODO � ABSTRADO
public abstract class MetodosAbstratos_shape {

	private MetodosAbstratos_Color metodosAbstratos_Color;
	
	public MetodosAbstratos_shape() {
	}
	
	public MetodosAbstratos_shape(MetodosAbstratos_Color metodosAbstratos_Color) {
		this.metodosAbstratos_Color = metodosAbstratos_Color;
	}

	public MetodosAbstratos_Color getMetodosAbstratos_Color() {
		return metodosAbstratos_Color;
	}

	public void setMetodosAbstratos_Color(MetodosAbstratos_Color metodosAbstratos_Color) {
		this.metodosAbstratos_Color = metodosAbstratos_Color;
	}
	
	//M�TODO ABSTRATO
	public abstract double area();
}