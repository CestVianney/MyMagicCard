package com.mymagiccard.adapters.xml.xmlv;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "set")
@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class SetXmlV {

    @XmlAttribute
    private String rarity;

    @XmlValue
    private String extension;

}
