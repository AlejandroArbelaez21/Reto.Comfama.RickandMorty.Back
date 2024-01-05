package com.comfama.reto.api.repository;

import com.comfama.reto.api.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    List<Favorite> findAll();
    void deleteByCharacterId(Long characterId);
}
