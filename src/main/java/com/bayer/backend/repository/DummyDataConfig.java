package com.bayer.backend.repository;

import com.bayer.backend.model.Character;
import com.bayer.backend.model.Location;
import com.bayer.backend.repository.CharacterRepository;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class DummyDataConfig {


    final
    CharacterRepository characterRepository;

    private List<Character> characterList=new ArrayList<>();

    private String[] names={"Robot Rick","Simple Rick","Cult Leader Morty","Cynthia","Eli","Father Bob","Slow Rick","Robot Morty", "Simple Morty","Garmanarnar","Pickle Rick"};
    private String[] status={"Dead","Alive","unknown"};
    private String[] type={"Fish-Person","Cat-Person","Human with antennae","Human"};
    private String[] location={"Testicle Monster Dimension","Earth (Replacement Dimension)","Earth (C-137)","Citadel of Ricks", "unknown"};
    private String[] locationUrl={"https://rickandmortyapi.com/api/location/3","https://rickandmortyapi.com/api/location/2","https://rickandmortyapi.com/api/location/4"};
    private String[] species={"Human","Humanoid","Robot"};
    private String[] gender={"Male","Female","Unknown"};
    private String[] image={"https://rickandmortyapi.com/api/character/avatar/2.jpeg","https://rickandmortyapi.com/api/character/avatar/3.jpeg",
            "https://rickandmortyapi.com/api/character/avatar/4.jpeg","https://rickandmortyapi.com/api/character/avatar/5.jpeg"};
    private String[] episode={"https://rickandmortyapi.com/api/episode/1",
            "https://rickandmortyapi.com/api/episode/2",
            "https://rickandmortyapi.com/api/episode/3",
            "https://rickandmortyapi.com/api/episode/4",
            "https://rickandmortyapi.com/api/episode/5",
            "https://rickandmortyapi.com/api/episode/6",
            "https://rickandmortyapi.com/api/episode/7",
            "https://rickandmortyapi.com/api/episode/8",
            "https://rickandmortyapi.com/api/episode/9",
            "https://rickandmortyapi.com/api/episode/10",
            "https://rickandmortyapi.com/api/episode/11",
            "https://rickandmortyapi.com/api/episode/12",
            "https://rickandmortyapi.com/api/episode/13",
            "https://rickandmortyapi.com/api/episode/14",
            "https://rickandmortyapi.com/api/episode/15",
            "https://rickandmortyapi.com/api/episode/16",
            "https://rickandmortyapi.com/api/episode/17",
            "https://rickandmortyapi.com/api/episode/18",
            "https://rickandmortyapi.com/api/episode/19",
            "https://rickandmortyapi.com/api/episode/20",};


    //Populates the in memory database with randomly generated data taken from the source api of rickandmorty.
    public DummyDataConfig(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;

        Date date=new Date();

        for(int i=0;i<=100;i++){
            Character character=new Character();
            character.setName(names[new Random().nextInt(names.length)]);
            character.setEpisode(Collections.singletonList(episode[new Random().nextInt(episode.length)]));
            character.setGender(gender[new Random().nextInt(gender.length)]);
            character.setImage(image[new Random().nextInt(image.length)]);
            Location locat=new Location();
            locat.setName(location[new Random().nextInt(location.length)]);
            locat.setUrl(locationUrl[new Random().nextInt(locationUrl.length)]);
            character.setLocation(locat);
            Location orig=new Location();
            orig.setName(location[new Random().nextInt(location.length)]);
            orig.setUrl(locationUrl[new Random().nextInt(locationUrl.length)]);
            character.setOrigin(orig);
            character.setGender(gender[new Random().nextInt(gender.length)]);
            character.setType(type[new Random().nextInt(type.length)]);
            character.setSpecies(species[new Random().nextInt(species.length)]);
            character.setStatus(status[new Random().nextInt(status.length)]);
            character.setCreated(date);
            characterRepository.save(character);
        }

    }
}
