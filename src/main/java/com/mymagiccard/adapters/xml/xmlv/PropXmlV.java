package com.mymagiccard.adapters.xml.xmlv;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "prop")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class PropXmlV {

    @XmlElement(name = "format-commander")
    private String formatCommander;

    private int cmc;
    private String type;
    private String side;
    private String coloridentity;
    private String maintype;
    private String pt;

    private String layout;
    private String manacost;

}
