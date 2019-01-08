package com.sobart.partslist2019.repository;

import com.sobart.partslist2019.entities.Part;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PartRepository extends JpaRepository<Part, Integer> {

    Page<Part> findByNameIsLike (String name, Pageable pageable);
    Page<Part> findAllByNecessaryTrue(Pageable pageable);
    Page<Part> findAllByNecessaryFalse(Pageable pageable);
    Part findFirstByNecessaryTrueOrderByCountAsc();

}
