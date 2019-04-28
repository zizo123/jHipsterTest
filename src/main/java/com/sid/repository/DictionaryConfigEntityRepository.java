package com.sid.repository;

import com.sid.domain.DictionaryConfigEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the DictionaryConfigEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DictionaryConfigEntityRepository extends JpaRepository<DictionaryConfigEntity, Long> {

}
