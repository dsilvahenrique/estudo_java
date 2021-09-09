package ad1;
import java.util.ArrayList;


public class Dicionario {

	ArrayList<Object> keys = new ArrayList();
	ArrayList<Object> values = new ArrayList();
	
	Object chave;
	Object valor;
	public Dicionario() {
		super();
		this.chave = chave;
		this.valor = valor;
		
	}
	public Object getChave() {
		return chave;
	}
	public void setChave(Object chave) {
		this.chave = chave;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object chave, Object valor ) {
		this.chave = chave;
		keys.add(chave);
		this.valor = valor;
		values.add(valor);
		//keys.add(valor);
		
		
	}
	@Override
	public String toString() {
		return this.keys + "=" + this.values;
	}
	
	
	
	

}
