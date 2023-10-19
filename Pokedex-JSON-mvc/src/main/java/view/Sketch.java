package view;

import handler.WebHandler;
import model.Pokemon;
import model.ResultAll;

public class Sketch {
	public static void main(String[] args) {
		WebHandler webHandler = new WebHandler("https://pokeapi.co/api/v2/pokemon-species?limit=1010");
		ResultAll resultAll = webHandler.getResult();
		for (Pokemon pokemon : resultAll.getPokemons()) {
			String foto = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
			String[] trozosfoto = pokemon.getUrl().split("/");
			foto += trozosfoto[trozosfoto.length - 1] + ".png";
			pokemon.setFoto(foto);
			System.out.println(pokemon);
		}
	}
}
