package com.sid.service.impl;

import com.sid.service.LabelEntityService;
import com.sid.domain.LabelEntity;
import com.sid.repository.LabelEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing LabelEntity.
 */
@Service
@Transactional
public class LabelEntityServiceImpl implements LabelEntityService {

    private final Logger log = LoggerFactory.getLogger(LabelEntityServiceImpl.class);

    private final LabelEntityRepository labelEntityRepository;

    public LabelEntityServiceImpl(LabelEntityRepository labelEntityRepository) {
        this.labelEntityRepository = labelEntityRepository;
    }

    /**
     * Save a labelEntity.
     *
     * @param labelEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public LabelEntity save(LabelEntity labelEntity) {
        log.debug("Request to save LabelEntity : {}", labelEntity);
        return labelEntityRepository.save(labelEntity);
    }

    /**
     * Get all the labelEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<LabelEntity> findAll() {
        log.debug("Request to get all LabelEntities");
        return labelEntityRepository.findAll();
    }


    /**
     * Get one labelEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<LabelEntity> findOne(Long id) {
        log.debug("Request to get LabelEntity : {}", id);
        return labelEntityRepository.findById(id);
    }

    /**
     * Delete the labelEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete LabelEntity : {}", id);
        labelEntityRepository.deleteById(id);
    }
}
