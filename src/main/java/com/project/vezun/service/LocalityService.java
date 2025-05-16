package com.project.vezun.service;

import com.project.vezun.entity.LocalityEntity;
import com.project.vezun.repository.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalityService {

    @Autowired
    private LocalityRepository localityRepository;

    public List<LocalityEntity> searchLocality(String query) {
        return localityRepository.findByNameStartWith(query);
    }
}
