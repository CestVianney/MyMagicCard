package com.swagger.swaggerApi.adapters.xml.xmlv;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "sets")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class EditionsXmlV {

    @XmlElement(name = "set")
    private List<EditionXmlV> edition;

}
