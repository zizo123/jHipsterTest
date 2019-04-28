package com.sid.repository;

import com.sid.domain.MappingEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MappingEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MappingEntityRepository extends JpaRepository<MappingEntity, Long> {

}
