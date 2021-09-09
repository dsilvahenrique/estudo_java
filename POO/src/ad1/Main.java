package ad1;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<String, String> dicionario = new HashMap<String, String>();
//		dicionario.put("1", "CARLOS");
//		System.out.println(dicionario);
		//Dicionario d1 = new Dicionario();
		Dicionario palavras = new Dicionario();
		//palavras.setValor(new Chave("autor"), new Valor("Coord. Disciplina"));
		palavras.setValor("CARLOS", "PROFESSOR");
		palavras.setValor("CARLA", "ZELADORA");
		System.out.println(palavras);
	}
}