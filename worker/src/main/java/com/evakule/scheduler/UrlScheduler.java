package com.evakule.scheduler;

import com.evakule.dao.UrlRepository;
import com.evakule.model.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UrlScheduler {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UrlRepository urlRepository;

    @Scheduled(fixedRate = 5000)
    public void checkStatus() {
        urlRepository.findAll().stream()
                .peek(u -> {
                    int status = getUrlStatus(u);
                    u.setStatus(status);
                })
                .forEach(urlRepository::save);
    }

    private Integer getUrlStatus(Url url) {
        return restTemplate.getForEntity(url.getBody(), String.class)
                .getStatusCode().value();
    }
}