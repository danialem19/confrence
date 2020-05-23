package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepostiroyImpl;
import com.pluralsight.repository.SpeakerRepostiroy;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepostiroy repository = new HibernateSpeakerRepostiroyImpl();
    @Override
    public List<Speaker> findAll(){
        return  repository.findAll();
    }
}
