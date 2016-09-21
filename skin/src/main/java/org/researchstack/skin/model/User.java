package org.researchstack.skin.model;

import java.io.Serializable;

/*
  Created by bradleymcdermott on 10/22/15.

  Updated by petriet on 09/20/16 to reflect new bridge API

 */
public class User implements Serializable
{
    private String firstName;

    private String lastName;

    private String email;

    private String birthDate;

    public User()
    {
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }

}
