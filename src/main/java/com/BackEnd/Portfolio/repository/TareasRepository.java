
package com.BackEnd.Portfolio.repository;

import com.BackEnd.Portfolio.model.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareasRepository extends JpaRepository<Tareas, Long> {
    
}
