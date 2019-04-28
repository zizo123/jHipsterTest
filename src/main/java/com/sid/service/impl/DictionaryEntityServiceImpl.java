package com.sid.service.impl;

import com.sid.service.DictionaryEntityService;
import com.sid.domain.DictionaryEntity;
import com.sid.repository.DictionaryEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing DictionaryEntity.
 */
@Service
@Transactional
public class DictionaryEntityServiceImpl implements DictionaryEntityService {

    private final Logger log = LoggerFactory.getLogger(DictionaryEntityServiceImpl.class);

    private final DictionaryEntityRepository dictionaryEntityRepository;

    public DictionaryEntityServiceImpl(DictionaryEntityRepository dictionaryEntityRepository) {
        this.dictionaryEntityRepository = dictionaryEntityRepository;
    }

    /**
     * Save a dictionaryEntity.
     *
     * @param dictionaryEntity the entity to save
     * @return the persisted entity
     */
    @Override
    public DictionaryEntity save(DictionaryEntity dictionaryEntity) {
        log.debug("Request to save DictionaryEntity : {}", dictionaryEntity);
        return dictionaryEntityRepository.save(dictionaryEntity);
    }

    /**
     * Get all the dictionaryEntities.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<DictionaryEntity> findAll() {
        log.debug("Request to get all DictionaryEntities");
        return dictionaryEntityRepository.findAll();
    }


    /**
     * Get one dictionaryEntity by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<DictionaryEntity> findOne(Long id) {
        log.debug("Request to get DictionaryEntity : {}", id);
        return dictionaryEntityRepository.findById(id);
    }

    /**
     * Delete the dictionaryEntity by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete DictionaryEntity : {}", id);
        dictionaryEntityRepository.deleteById(id);
    }
}
