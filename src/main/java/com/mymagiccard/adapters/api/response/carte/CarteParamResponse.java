package com.mymagiccard.adapters.api.response.carte;

import com.mymagiccard.adapters.api.response.EditionResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CarteParamResponse {
    private Integer id;
    private String name;
    private String text;
    private int cmc;
    private String type;
    private String maintype;
    private String coloridentity;
    private String pt;
    private String layout;
    private String manacost;
    private String rarity;
    private List<EditionResponse> editions;
    private int num;
}
