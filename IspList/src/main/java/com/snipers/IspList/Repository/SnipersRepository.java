package com.snipers.IspList.Repository;

import com.snipers.IspList.model.Snipers;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/2/2019
 * Time: 8:02 PM
 */
public interface SnipersRepository extends MongoRepository<Snipers,Integer>
{
    public Snipers findByName(String name);
}
