
package com.BackEnd.Portfolio.repository;

import com.BackEnd.Portfolio.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository<Formacion, Long> {
    
}
