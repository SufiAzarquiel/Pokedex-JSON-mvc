package model;

public class Pokemon {
	private String name;
	private String url;
	private String foto;

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", url=" + url + ", foto=" + foto + "]";
	}

}
