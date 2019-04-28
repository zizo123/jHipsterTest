package com.sid.repository;

import com.sid.domain.DictionaryEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the DictionaryEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DictionaryEntityRepository extends JpaRepository<DictionaryEntity, Long> {

}
