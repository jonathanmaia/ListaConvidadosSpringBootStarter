package br.jus.trt7.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.trt7.listavip.model.Convidado;
import br.jus.trt7.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;
	
	public Iterable<Convidado> obterTodos() {
		return repository.findAll();
	}
	
	public void salvar(Convidado convidado) {
		repository.save(convidado);
	}
}
