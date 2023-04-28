package com.example.stage.dao;

import com.example.stage.bean.Remarque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemarqueDao extends JpaRepository<Remarque,Long > {

}
