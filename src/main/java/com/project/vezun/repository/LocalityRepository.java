package com.project.vezun.repository;

import com.project.vezun.entity.LocalityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocalityRepository extends JpaRepository<LocalityEntity, Long> {

    @Query("SELECT le FROM LocalityEntity le WHERE lower(le.name) like lower(concat(?1, '%'))")
    List<LocalityEntity> findByNameStartWith(String name);
}
