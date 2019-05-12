package com.snipers.IspList.Repository;

import com.snipers.IspList.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/4/2019
 * Time: 5:08 PM
 */
public interface UserRepository extends MongoRepository<Users, String>
{
}
