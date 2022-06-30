package entities;

public class Comment_composicao {

	private String text;

	public Comment_composicao() {
		}

	public Comment_composicao(String text) {
			this.text = text;
		}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}