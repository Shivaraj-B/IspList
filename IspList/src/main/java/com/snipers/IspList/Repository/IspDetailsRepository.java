package com.snipers.IspList.Repository;

import com.snipers.IspList.model.IspDAO;
import com.snipers.IspList.model.Snipers;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/2/2019
 * Time: 8:02 PM
 */
public interface IspDetailsRepository extends MongoRepository<IspDAO,Integer>
{
    IspDAO findByName(String name);
}
