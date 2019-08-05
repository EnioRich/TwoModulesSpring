package com.evakule.controller;


import com.evakule.model.Url;
import com.evakule.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class UrlController {

    @Autowired
    UrlService urlService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getAllUrls(ModelAndView mw) {
        List<Url> urlList = urlService.getAll()
                .orElseGet(Collections::emptyList);

        mw.addObject("urlList", urlList);
        mw.setViewName("home");
        return mw;
    }

    @RequestMapping(value = "/add-url", method = RequestMethod.POST)
    public ModelAndView addUrl(@ModelAttribute Url url, ModelAndView mw) {
        urlService.addUrl(url);
        List<Url> urlList = urlService.getAll()
                .orElseGet(Collections::emptyList);

        mw.addObject("urlList", urlList);
        mw.setViewName("home");
        return mw;
    }

    @RequestMapping(value = "/add-url", method = RequestMethod.GET)
    public ModelAndView addUrl(ModelAndView mw) {

        mw.addObject("url", new Url());
        mw.setViewName("addUrl");
        return mw;
    }



}
