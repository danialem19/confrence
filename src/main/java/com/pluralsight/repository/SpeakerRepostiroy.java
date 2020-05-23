package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerRepostiroy {
    List<Speaker> findAll();
}
