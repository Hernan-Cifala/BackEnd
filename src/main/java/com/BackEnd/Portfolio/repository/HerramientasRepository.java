
package com.BackEnd.Portfolio.repository;

import com.BackEnd.Portfolio.model.Herramientas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HerramientasRepository extends JpaRepository<Herramientas, Long> {
    
}
