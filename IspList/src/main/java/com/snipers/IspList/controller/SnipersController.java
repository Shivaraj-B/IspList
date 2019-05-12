package com.snipers.IspList.controller;

import com.snipers.IspList.model.Snipers;
import com.snipers.IspList.service.SniperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/2/2019
 * Time: 8:00 PM
 */

@RestController
public class SnipersController
{
    @Autowired
    private SniperService sniperService;

    @RequestMapping(method = RequestMethod.GET , value ="/snipers")
    public List<Snipers> getAllTopics()
    {
        List<Snipers> allTopics =sniperService.getAllSnipers();
        allTopics.stream().forEach(System.out::print);
         return allTopics;
    }

    @RequestMapping("/snipers/{name}")
    public Snipers getSnipersByName(@PathVariable String name )
    {
        System.out.println("hit it"+name);
        return sniperService.getSnipersByName(name);
        //return null;
    }

}
