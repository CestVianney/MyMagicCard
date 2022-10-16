package com.swagger.swaggerApi.adapters.xml.xmlv;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Calendar;

@XmlRootElement(name = "set")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class EditionXmlV {

    @XmlElement(name="name")
    private String diminutif;

    @XmlElement(name="longname")
    private String name;

    @XmlElement(name = "settype")
    private String setType;

    @XmlElement(name = "releasedate")
    private Calendar releaseDate;

}
