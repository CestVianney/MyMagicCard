package com.swagger.swaggerApi.adapters.xml.xmlv;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cards")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class CartesXmlV {
    @XmlElement(name = "card")
    private List<CarteXmlV> cartes;
}
