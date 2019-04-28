package com.sid.repository;

import com.sid.domain.AttributDefEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AttributDefEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AttributDefEntityRepository extends JpaRepository<AttributDefEntity, Long> {

}
