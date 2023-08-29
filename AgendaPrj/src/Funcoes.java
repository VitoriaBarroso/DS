
public abstract class Funcoes {
	private String nome, local, repetir, data,hora,alerta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public  String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getRepetir() {
		return repetir;
	}

	public void setRepetir(String repetir) {
		this.repetir = repetir;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAlerta() {
		return alerta;
	}

	public void setAlerta(String alerta) {
		this.alerta = alerta;
	}
	
	public abstract void cadastrar();
	public abstract void modificar();
	public abstract void excluirEvento();
	
	
}


