package br.com.todolist.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.todolist.model.TesteModel;
import br.com.todolist.repositories.OutroRepository;

@Named
@ViewScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private OutroRepository repository;

	private TesteModel novoUsuarioModel;

	public UsuarioBean() {
		novoUsuarioModel = new TesteModel();
	}

	public void salvarUsuario() {
		repository.salvar(novoUsuarioModel);
	}

	public TesteModel getNovoUsuarioModel() {
		return novoUsuarioModel;
	}

}
