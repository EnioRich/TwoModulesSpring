package com.evakule.controller;


import com.evakule.model.Url;
import com.evakule.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class UrlController {

    @Autowired
    UrlService urlService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getAllUrls(ModelAndView mw) {
        List<Url> urlList = urlService.getAll().orElseGet(Collections::emptyList);
        mw.addObject("urlList", urlList);
        mw.setViewName("home");
        return mw;
    }
}
