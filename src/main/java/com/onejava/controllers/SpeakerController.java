package com.onejava.controllers;

import com.onejava.dtos.SpeakerDto;
import com.onejava.entities.Speaker;
import com.onejava.modelMapper.ModelMapper;
import com.onejava.repositories.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {
    @Autowired
    private SpeakerRepository speakerRepository;

    @PostMapping
    public void create(@RequestBody SpeakerDto speakerDto){
        speakerRepository.saveAndFlush(ModelMapper.convert(speakerDto, Speaker.class));
    }

    @GetMapping
    public List<Speaker> read(){
        return speakerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Speaker read(@PathVariable Long id){
        return speakerRepository.getById(id);
    }

    @PutMapping("/{id}")
    public Speaker update(@PathVariable Long id, @RequestBody SpeakerDto speakerDto){
        Speaker existingSpeaker = speakerRepository.getById(id);
        BeanUtils.copyProperties(ModelMapper.convert(speakerDto, Speaker.class), existingSpeaker, "id");
        return speakerRepository.saveAndFlush(existingSpeaker);
    }

    @DeleteMapping
    public void delete(@RequestBody SpeakerDto speakerDto){
        speakerRepository.delete(ModelMapper.convert(speakerDto, Speaker.class));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        speakerRepository.deleteById(id);
    }
}
