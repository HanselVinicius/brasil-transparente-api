package com.brasil.transparente.api.repository;

import com.brasil.transparente.api.entity.Poder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoderRepository extends JpaRepository<Poder, String> {
}