package com.sid.service.impl;

import com.sid.service.ConstraintEntityService;
import com.sid.domain.ConstraintEntity;
import com.sid.repository.ConstraintEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing ConstraintEntity.
 */
@Service
@Transactional
public class ConstraintEntityServiceImpl implements ConstraintEntityService {

    private final Logger log = LoggerFactory.getLogger(ConstraintEntityServiceImpl.class);

    private final ConstraintEntityRepository constraintEntityRepository;

    public ConstraintEntityServiceImpl(ConstraintEntityRepository constraintEntityRepository) {
        this.constraintEntityRepository = constraintEntityRepository;
    }

    /**
     * Save a constraintEntity.
     *
     * @param constraintEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public ConstraintEntity save(ConstraintEntity constraintEntity) {
        log.debug("Request to save ConstraintEntity : {}", constraintEntity);
        return constraintEntityRepository.save(constraintEntity);
    }

    /**
     * Get all the constraintEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<ConstraintEntity> findAll() {
        log.debug("Request to get all ConstraintEntities");
        return constraintEntityRepository.findAll();
    }


    /**
     * Get one constraintEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ConstraintEntity> findOne(Long id) {
        log.debug("Request to get ConstraintEntity : {}", id);
        return constraintEntityRepository.findById(id);
    }

    /**
     * Delete the constraintEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ConstraintEntity : {}", id);
        constraintEntityRepository.deleteById(id);
    }
}
