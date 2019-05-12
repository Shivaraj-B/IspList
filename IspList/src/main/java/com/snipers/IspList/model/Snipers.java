package com.snipers.IspList.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/2/2019
 * Time: 7:55 PM
 */


@Document(collection = "snipers")
public class Snipers
{
    @Id
    int id;
    private String name;
    private String designation;
    private String hobbies;

    public Snipers(String name, String designation, String hobbies)
    {
        this.name = name;
        this.designation = designation;
        this.hobbies = hobbies;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(String hobbies)
    {
        this.hobbies = hobbies;
    }




}
