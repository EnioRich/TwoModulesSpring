package com.evakule.service;

import com.evakule.dao.UrlRepository;
import com.evakule.model.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrlServiceImpl implements UrlService{

    @Autowired
    UrlRepository urlRepository;

    @Override
    public Optional<List<Url>> getAll() {
        return Optional.of(urlRepository.findAll());
    }

    @Override
    public Url addUrl(Url url) {
        url.setStatus("404");
        return urlRepository.save(url);
    }
}
