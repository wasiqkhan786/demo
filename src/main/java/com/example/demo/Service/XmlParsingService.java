/*
package com.example.demo.Service;

import com.example.demo.Repository.AutomatedtestsRepository;
import com.example.demo.Repository.TestsuiteRepository;
import com.example.demo.model.Automatedtests;
import com.example.demo.model.Testsuite;

import org.aspectj.weaver.ast.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.transaction.Transactional;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.StringReader;
import java.time.ZonedDateTime;

@Service
@Transactional
public class XmlParsingService {

    private final Logger log = LoggerFactory.getLogger(XmlParsingService.class);
    @Autowired
    private Automatedtests automatedtests;
    private AutomatedtestsRepository testsuiteRepository;

    public Automatedtests readXML(String path){

DocumentBuilderFactory dbf;

   DocumentBuilder db;

        Document document;
        NodeList nodeList;
        String result = "";
        Automatedtests testSuite = new Automatedtests();
        try{
            //dbf = DocumentBuilderFactory.newInstance();
            //db = dbf.newDocumentBuilder();
            //document = db.parse(path);
            document = convertStringToXMLDocument(path);
            nodeList = document.getElementsByTagName("testsuite");
            for(int x=0,size= nodeList.getLength(); x<size; x++) {

                System.out.println(nodeList.item(x).getAttributes().getNamedItem("name").getNodeValue());
                System.out.println(nodeList.item(x).getAttributes().getNamedItem("failures").getNodeValue());
                System.out.println(nodeList.item(x).getAttributes().getNamedItem("errors").getNodeValue());
                System.out.println(nodeList.item(x).getAttributes().getNamedItem("time").getNodeValue());
                System.out.println(nodeList.item(x).getAttributes().getNamedItem("skipped").getNodeValue());
                System.out.println(nodeList.item(x).getAttributes().getNamedItem("timestamp").getNodeValue());
                System.out.println(nodeList.item(x).getAttributes().getNamedItem("hostname").getNodeValue());



                testSuite.setName(nodeList.item(x).getAttributes().getNamedItem("name").getNodeValue());
                testSuite.setTests(Long.parseLong(nodeList.item(x).getAttributes().getNamedItem("tests").getNodeValue()));
                testSuite.setFailures(Long.parseLong(nodeList.item(x).getAttributes().getNamedItem("failures").getNodeValue()));
                testSuite.setErrors(Long.parseLong(nodeList.item(x).getAttributes().getNamedItem("errors").getNodeValue()));
                testSuite.setTime(Long.parseLong(nodeList.item(x).getAttributes().getNamedItem("time").getNodeValue()));
                testSuite.setSkipped(Long.parseLong(nodeList.item(x).getAttributes().getNamedItem("skipped").getNodeValue()));
                testSuite.setTimestamp((nodeList.item(x).getAttributes().getNamedItem("timestamp").getNodeValue()));
                testSuite.setHostname(nodeList.item(x).getAttributes().getNamedItem("hostname").getNodeValue());
            }

        }
        catch (Exception e){
            log.error(e.getMessage());
        }
        return testSuite;
    }
    private static Document convertStringToXMLDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
*/
