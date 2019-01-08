package com.sobart.partslist2019.service;

import com.sobart.partslist2019.entities.Part;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PartService {

    Part getPartById(Integer id);
    void savePart(Part part);
    void updatePart(Integer id, String name, Boolean necessary, Integer count);
    void deletePart(Integer id);

    Page<Part> findAllPaged(Pageable pageable);
    Page<Part> findNecessaryPaged(Pageable pageable);
    Page<Part> findOptionalPaged(Pageable pageable);
    Page<Part> findByNamePaged(String pattern, Pageable pageable);
    Part findNecessaryPart();

}
