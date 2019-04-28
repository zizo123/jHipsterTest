package com.sid.repository;

import com.sid.domain.LabelEntity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the LabelEntity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LabelEntityRepository extends JpaRepository<LabelEntity, Long> {

}
