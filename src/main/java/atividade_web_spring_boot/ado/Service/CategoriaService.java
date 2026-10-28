package atividade_web_spring_boot.ado.Service;

import atividade_web_spring_boot.ado.model.categoria;
import atividade_web_spring_boot.ado.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<categoria> listarTodas() {
        return repository.findAll();
    }

    public Optional<categoria> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public categoria salvar(categoria categoria) {
        return repository.save(categoria);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}