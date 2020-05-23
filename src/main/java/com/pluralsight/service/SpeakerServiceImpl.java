package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepostiroyImpl;
import com.pluralsight.repository.SpeakerRepostiroy;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepostiroy repository;
    @Override
    public List<Speaker> findAll(){
        return  repository.findAll();
    }

    public void setRepository(SpeakerRepostiroy repository) {
        this.repository = repository;
    }
}
