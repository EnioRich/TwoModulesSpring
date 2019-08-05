package com.evakule.scheduler;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UrlScheduler {

    @Scheduled(fixedRate = 5000)
    public void checkStatus() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://finviz.com/";
        ResponseEntity<String> responseEntity = restTemplate
                .getForEntity(url, String.class);

        System.out.println(responseEntity.getStatusCode().value());
    }
}
