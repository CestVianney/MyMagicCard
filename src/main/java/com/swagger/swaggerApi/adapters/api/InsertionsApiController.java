package com.swagger.swaggerApi.adapters.api;

import com.swagger.swaggerApi.adapters.xml.mapper.CarteXmlvMapper;
import com.swagger.swaggerApi.adapters.xml.mapper.EditionXmlvMapper;
import com.swagger.swaggerApi.adapters.xml.xmlv.CartesXmlV;
import com.swagger.swaggerApi.adapters.xml.xmlv.EditionsXmlV;
import com.swagger.swaggerApi.domain.ports.api.InsertionsApiPort;
import com.swagger.swaggerApi.domain.service.impl.CartesAppServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@RestController
@RequestMapping("api/insert")
@Api(value = "insert", tags = "insert")
@AllArgsConstructor
public class InsertionsApiController implements InsertionsApiPort {

    private CartesAppServiceImpl service;

    private CarteXmlvMapper carteXmlvMapper;

    private EditionXmlvMapper editionXmlMapper;

    @Override
    @ApiOperation("Lecture des xml pour insertion des cartes en base")
    @PostMapping(path = "/postXmlCartes")
    public void postCardsXmlToDb() {
        try {
            File file = new File("C:\\temp\\cardsSolo.xml");
            JAXBContext context = JAXBContext.newInstance(CartesXmlV.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            CartesXmlV xml = (CartesXmlV)  unmarshaller.unmarshal(file);
            xml.getCartes().forEach(carteXml -> service.postCartesToDb(this.carteXmlvMapper.mapToCarte(carteXml)));

            System.out.println("Fin de traitement -> Insertions des cartes depuis XML vers DB");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @ApiOperation("Lecture des xml pour insertion des editions en base")
    @PostMapping(path = "/postXmlEditions")
    @Override
    public void postEditionsXmlToDb() {
        try {
            File file = new File("C:\\temp\\setsSolo.xml");
            JAXBContext context= JAXBContext.newInstance(EditionsXmlV.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            EditionsXmlV xml = (EditionsXmlV) unmarshaller.unmarshal(file);
            xml.getEdition().forEach(editionXml -> service.postEditionToDb(this.editionXmlMapper.mapToModel(editionXml)));
            System.out.println("Fin de traitement -> Insertions des editions depuis XML vers DB");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
