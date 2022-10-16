package com.mymagiccard.adapters.xml.mapper;

import com.mymagiccard.adapters.xml.xmlv.CarteXmlV;
import com.mymagiccard.adapters.xml.xmlv.SetXmlV;
import com.mymagiccard.domain.model.CarteParam;
import com.mymagiccard.domain.model.Edition;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface CarteXmlvMapper {

    @Mapping(target = "cmc", source = "prop.cmc")
    @Mapping(target = "type", source = "prop.type")
    @Mapping(target = "maintype", source = "prop.maintype")
    @Mapping(target = "coloridentity", source = "prop.coloridentity")
    @Mapping(target = "pt", source = "prop.pt")
    @Mapping(target = "layout", source = "prop.layout")
    @Mapping(target = "manacost", source = "prop.manacost")
    @Mapping(target = "rarity", expression = "java(xml.getSet().get(0).getRarity())")
    @Mapping(target = "editions", ignore = true)
    CarteParam mapToCarte(CarteXmlV xml);

    @AfterMapping
    default void setEditions(CarteXmlV xml, @MappingTarget CarteParam carteParam) {
        List<String> listEditions = xml.getSet().stream().map(SetXmlV::getExtension).collect(Collectors.toList());
        List<Edition> listEdition = new ArrayList<>();
        listEditions.forEach(s -> {
            Edition edition = new Edition();
            edition.setDiminutif(s);
            listEdition.add(edition);
        });
        carteParam.setEditions(listEdition);
    }
}