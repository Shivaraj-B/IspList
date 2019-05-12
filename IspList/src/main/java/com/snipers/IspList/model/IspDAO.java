package com.snipers.IspList.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/4/2019
 * Time: 7:33 PM
 */

@Document(collection = "ispdetails")
public class IspDAO
{
    @Id
    private String id;
    private String name;
    private double lowestPrice;
    private float rating;
    private int maxSpeed;
    private int contactNumber;
    private String emailId;
    private String description;
   // private PlansDAO plans;

    public IspDAO()
    {
    }
 public IspDAO(String id, String name, double lowestPrice, float rating, int maxSpeed, int contactNumber, String emailId,String description)
    {
        this.id = id;
        this.name = name;
        this.lowestPrice = lowestPrice;
        this.rating = rating;
        this.maxSpeed = maxSpeed;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.description = description;
    }

   /* public IspDAO(int contactNumber, String id, String name, double lowestPrice, float rating, int maxSpeed, String emailId, String description, PlansDAO plans)
    {
        this.contactNumber = contactNumber;
        this.id = id;
        this.name = name;
        this.lowestPrice = lowestPrice;
        this.rating = rating;
        this.maxSpeed = maxSpeed;
        this.emailId = emailId;
        this.description = description;
        this.plans = plans;
    }*/

    public IspDAO(String name, double lowestPrice, float rating, int maxSpeed, int contactNumber, String emailId,String description)
    {
        this.name = name;
        this.lowestPrice = lowestPrice;
        this.rating = rating;
        this.maxSpeed = maxSpeed;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
        this.description =description;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPlanName()
    {
        return name;
    }

    public void setPlanName(String name)
    {
        this.name = name;
    }

    public double getLowestPrice()
    {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice)
    {
        this.lowestPrice = lowestPrice;
    }

    public float getRating()
    {
        return rating;
    }

    public void setRating(float rating)
    {
        this.rating = rating;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getContactNumber()
    {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber)
    {
        this.contactNumber = contactNumber;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    /*public PlansDAO getPlans()
    {
        return plans;
    }

    public void setPlans(PlansDAO plans)
    {
        this.plans = plans;
    }*/

}
