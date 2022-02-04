package com.fellipe.kennelsystem.repository;

import com.fellipe.kennelsystem.entity.Litter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LitterRepository extends JpaRepository<Litter, Long> {
}
