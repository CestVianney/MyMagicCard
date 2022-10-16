package com.swagger.swaggerApi.adapters.xml.xmlv;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "card")
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class CarteXmlV {

    private String name;
    private String text;

    @XmlElement(name = "prop")
    private PropXmlV prop;

    @XmlElement(name = "set")
    private List<SetXmlV> set;
}
