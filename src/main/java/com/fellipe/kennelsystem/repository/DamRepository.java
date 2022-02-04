package com.fellipe.kennelsystem.repository;

import com.fellipe.kennelsystem.entity.Dam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DamRepository extends JpaRepository<Dam, Long> {
}
