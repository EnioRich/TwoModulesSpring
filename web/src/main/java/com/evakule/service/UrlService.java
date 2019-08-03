package com.evakule.service;

import com.evakule.model.Url;

import java.util.List;
import java.util.Optional;

public interface UrlService {

    Optional<List<Url>> getAll();
}
