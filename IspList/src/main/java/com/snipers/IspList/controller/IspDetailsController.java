package com.snipers.IspList.controller;

import com.snipers.IspList.Repository.IspDetailsRepository;
import com.snipers.IspList.model.IspDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/2/2019
 * Time: 8:00 PM
 */

@RestController
public class IspDetailsController
{
    @Autowired
    private IspDetailsRepository ispRepository;

    @RequestMapping(method = RequestMethod.GET , value ="/ispdetails")
    public List<IspDAO> getAllIspDetails()
    {
         return ispRepository.findAll();
    }

    @RequestMapping("/ispdetails/{name}")
    public IspDAO getIspByName(@PathVariable String name)
    {
        return ispRepository.findByName(name);
    }

    @PutMapping("/ispdetails/{name}")
    public void updateRatings(@RequestBody IspDAO isp, @PathVariable String name) {

        IspDAO ispDao = ispRepository.findByName(name);

        /*if (!ispDao.isPresent())
            return ResponseEntity.notFound().build();*/

        float newRating= (isp.getRating()+ ispDao.getRating())/2;
        System.out.println("rating "+newRating);
        isp.setRating(newRating);

        ispRepository.save(isp);

    }

}
