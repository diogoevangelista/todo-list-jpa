package br.com.todolist.model;

public enum StatusTarefa {
	
	PENDENTE ("Pendente"),
	FAZENDO ("Fazendo"),
	CONCLUIDO ("Concluido"),
	CANCELADO ("Cancelado");
	
	private String status;

	public String getStatus() {
		return status;
	}

	private StatusTarefa(String status) {
		this.status = status;
	}

	
	
}
