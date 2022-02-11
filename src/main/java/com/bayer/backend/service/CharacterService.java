package com.bayer.backend.service;
import com.bayer.backend.repository.CharacterRepository;
import com.bayer.backend.model.Character;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CharacterService {


    final
    CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    public List<Character> getCharacters(String name){
        List<Character> characterList=new ArrayList<>();
        if(null !=name){
            characterList=characterRepository.findAllByNameContainingIgnoreCase(name);
        }else{
            characterList=characterRepository.findAll();
        }

        return characterList;
    }

}
