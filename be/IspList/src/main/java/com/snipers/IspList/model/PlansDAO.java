package com.snipers.IspList.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * User: sbasavegowd
 * Date: 5/4/2019
 * Time: 7:33 PM
 */

@Document(collection = "plandetails")
public class PlansDAO
{
 /*   @Id
    private String id;*/
    private String planName;
    private int speed;
    private int fup;
    private int cost;

    public PlansDAO(String planName, int speed, int fup, int cost)
    {
        this.planName = planName;
        this.speed = speed;
        this.fup = fup;
        this.cost = cost;
    }

    public PlansDAO(String id, String planName, int speed, int fup, int cost)
    {
        //this.id = id;
        this.planName = planName;
        this.speed = speed;
        this.fup = fup;
        this.cost = cost;
    }

  /*  public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
*/
    public String getPlanName()
    {
        return planName;
    }

    public void setPlanName(String planName)
    {
        this.planName = planName;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getFup()
    {
        return fup;
    }

    public void setFup(int fup)
    {
        this.fup = fup;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
