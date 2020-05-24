package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepostiroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepostiroy repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepostiroy speakerRepostiroy){
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepostiroy;
    }


    public List<Speaker> findAll(){
        return  repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepostiroy repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
