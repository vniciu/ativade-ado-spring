package atividade_web_spring_boot.ado.repository;

import atividade_web_spring_boot.ado.model.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<categoria, Long> {
}