package atividade_web_spring_boot.ado.Controller;

import atividade_web_spring_boot.ado.model.produto;
import atividade_web_spring_boot.ado.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<produto> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<produto> criar(@RequestBody produto produto) {
        produto novoProduto = service.salvar(produto);
        return ResponseEntity.status(201).body(novoProduto);
    }
}