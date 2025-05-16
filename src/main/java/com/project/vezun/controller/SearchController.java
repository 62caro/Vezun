package com.project.vezun.controller;

import com.project.vezun.entity.LocalityEntity;
import com.project.vezun.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private LocalityService localityService;

    @GetMapping
    public List<LocalityEntity> search(@RequestParam("locality") String locality) {
        return localityService.searchLocality(locality);
    }

}
