package com.sid.service.impl;

import com.sid.service.ConstraintDefEntityService;
import com.sid.domain.ConstraintDefEntity;
import com.sid.repository.ConstraintDefEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing ConstraintDefEntity.
 */
@Service
@Transactional
public class ConstraintDefEntityServiceImpl implements ConstraintDefEntityService {

    private final Logger log = LoggerFactory.getLogger(ConstraintDefEntityServiceImpl.class);

    private final ConstraintDefEntityRepository constraintDefEntityRepository;

    public ConstraintDefEntityServiceImpl(ConstraintDefEntityRepository constraintDefEntityRepository) {
        this.constraintDefEntityRepository = constraintDefEntityRepository;
    }

    /**
     * Save a constraintDefEntity.
     *
     * @param constraintDefEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public ConstraintDefEntity save(ConstraintDefEntity constraintDefEntity) {
        log.debug("Request to save ConstraintDefEntity : {}", constraintDefEntity);
        return constraintDefEntityRepository.save(constraintDefEntity);
    }

    /**
     * Get all the constraintDefEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<ConstraintDefEntity> findAll() {
        log.debug("Request to get all ConstraintDefEntities");
        return constraintDefEntityRepository.findAll();
    }


    /**
     * Get one constraintDefEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<ConstraintDefEntity> findOne(Long id) {
        log.debug("Request to get ConstraintDefEntity : {}", id);
        return constraintDefEntityRepository.findById(id);
    }

    /**
     * Delete the constraintDefEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ConstraintDefEntity : {}", id);
        constraintDefEntityRepository.deleteById(id);
    }
}
