package com.mymagiccard.adapters.xml.mapper;

import com.mymagiccard.adapters.xml.xmlv.EditionXmlV;
import com.mymagiccard.domain.model.Edition;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.time.LocalDate;
import java.util.Calendar;

@Mapper
public interface EditionXmlvMapper {

    Edition mapToModel(EditionXmlV xml);

    @AfterMapping
    default void setDate(EditionXmlV xml, @MappingTarget Edition model){
        Calendar date = xml.getReleaseDate();
        if(null != date) {
            LocalDate localDate = LocalDate.of(date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1, date.get(Calendar.DAY_OF_MONTH));
            model.setReleaseDate(localDate);
        } else {
            model.setReleaseDate(null);
        }
    }
}
