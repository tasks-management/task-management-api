package com.api.backendapi.repository;

import com.api.backendapi.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query(value = "SELECT t FROM Team t WHERE t.id = :id")
    Team findTeamInfoById(@Param("id") Long id);
}
