package com.snipers.IspList.service;

import com.snipers.IspList.Repository.SnipersRepository;
import com.snipers.IspList.model.Snipers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/2/2019
 * Time: 8:00 PM
 */

@Service
public class SniperService
{
    @Autowired
    SnipersRepository snipersRepository;



    public Snipers getSnipersByName(String name)
    {
        return snipersRepository.findByName(name);

    }

    public List<Snipers> getAllSnipers()
    {
        return snipersRepository.findAll();

    }
}
