package com.devsuperior.dsmeta.repositories;

import com.devsuperior.dsmeta.dto.SaleMinDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    List<SaleMinDTO> teste();
}
