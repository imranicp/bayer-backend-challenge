package com.bayer.backend.controller;


import com.bayer.backend.service.CharacterService;
import com.bayer.backend.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController("/")
public class CharacterController {


    @Autowired
    CharacterService characterService;

    @GetMapping("character")
    public List<Character> getCharacters(@PathParam("name") String name){
        return characterService.getCharacters(name);
    }

}
