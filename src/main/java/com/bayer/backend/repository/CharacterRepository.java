package com.bayer.backend.repository;

import com.bayer.backend.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character,Integer> {
    List<Character> findAllByNameContainingIgnoreCase(String name);
}
