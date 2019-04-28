package com.sid.repository;

import com.sid.domain.MetadataEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MetadataEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MetadataEntityRepository extends JpaRepository<MetadataEntity, Long> {

}
