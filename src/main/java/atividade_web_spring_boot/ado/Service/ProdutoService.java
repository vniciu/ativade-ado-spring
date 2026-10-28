package atividade_web_spring_boot.ado.Service;

import atividade_web_spring_boot.ado.model.produto;
import atividade_web_spring_boot.ado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<produto> listarTodos() {
        return repository.findAll();
    }

    public Optional<produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public produto salvar(produto produto) {
        return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}