
package com.BackEnd.Portfolio.repository;

import com.BackEnd.Portfolio.model.Conocimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientosRepository extends JpaRepository<Conocimientos, Long> {
    
}
