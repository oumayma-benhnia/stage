package com.example.stage.dao;



import com.example.stage.bean.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceDao extends JpaRepository<Service, Long> {
    Optional<Service> findById(Long id);
    void deleteById(Long id);
}
