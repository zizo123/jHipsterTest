package com.sid.repository;

import com.sid.domain.AttributEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AttributEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AttributEntityRepository extends JpaRepository<AttributEntity, Long> {

}
