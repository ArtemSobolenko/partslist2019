package com.sobart.partslist2019.service;

import com.sobart.partslist2019.entities.Part;
import com.sobart.partslist2019.repository.PartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PartServiceImpl implements PartService {

    private PartRepository repository;

    @Autowired
    public void setProductRepository(PartRepository repository) {
        this.repository = repository;
    }

    @Override
    public Part getPartById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public void savePart(Part part) {
        repository.save(part);
    }

    @Override
    public void updatePart(Integer id, String name, Boolean necessary, Integer count) {
        Part updated = repository.getOne(id);
        updated.setName(name);
        updated.setNecessary(necessary);
        updated.setCount(count);
        repository.save(updated);
    }

    @Override
    public void deletePart(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Part> findAllPaged(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Part> findNecessaryPaged(Pageable pageable) {
        return repository.findAllByNecessaryTrue(pageable);
    }

    @Override
    public Page<Part> findOptionalPaged(Pageable pageable) {
        return repository.findAllByNecessaryFalse(pageable);
    }

    @Override
    public Page<Part> findByNamePaged(String pattern, Pageable pageable) {
        return repository.findByNameIsLike(pattern, pageable);
    }

    @Override
    public Part findNecessaryPart() {
        return repository.findFirstByNecessaryTrueOrderByCountAsc();
    }

}
