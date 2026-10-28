package atividade_web_spring_boot.ado.Controller;

import atividade_web_spring_boot.ado.model.categoria;
import atividade_web_spring_boot.ado.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<categoria> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public ResponseEntity<categoria> criar(@RequestBody categoria categoria) {
        categoria novaCategoria = service.salvar(categoria);
        return ResponseEntity.status(201).body(novaCategoria);
    }
}