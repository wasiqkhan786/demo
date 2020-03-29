package com.example.demo.Controller;


import com.example.demo.Repository.AutomatedtestsRepository;

import com.example.demo.Service.AutomatedtestsService;
import com.example.demo.model.Automatedtests;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping("/api")
public class TestsuiteController {



    @Autowired
    private AutomatedtestsService automatedtestsService;
    @Autowired
    private AutomatedtestsRepository automatedtestsRepository;
   /* @Autowired
    XmlParsingService xmlParseService;
    @Autowired
    private TeamService teamService;


    @PostMapping(value = "/Automatedtests")
    public Automatedtests readXmlFile(@RequestParam("file") MultipartFile file) {
        Testsuite resultObject;
        resultObject = xmlParseService.readXML();

         String result =  resultObject.getHostname() + ":"+ resultObject.getTimestamp()+":" + resultObject.getName() ;
        Testsuite saved = testsuiteService.saveall(resultObject);
        return ResponseEntity.ok().header("").body(saved);
    }

*/

/*
    @PostMapping(value = "/Automatedtests2", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> readXmlFilewihtout(@RequestBody Testsuite testSuite) {
        Testsuite returnvalue = new Testsuite();
        returnvalue.setTests(testSuite.getTests());
        returnvalue.setFailures(testSuite.getFailures());
        returnvalue.setErrors(testSuite.getErrors());
        returnvalue.setTime(testSuite.getTime());
        returnvalue.setSkipped(testSuite.getSkipped());
        returnvalue.setTimestamp(testSuite.getTimestamp());
        returnvalue.setHostname(testSuite.getHostname());
        return new ResponseEntity<Testsuite>(returnvalue, HttpStatus.OK);
    }*/

/*
    @PostMapping(value = "Automatedtests", consumes = "application/x-www-form-urlencoded",produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Automatedtests create(@RequestParam("file") MultipartFile uploadFile )
    {
        String fileName = StringUtils.cleanPath(uploadFile.getOriginalFilename());
        return automatedtestsRepository.save (automatedtests);

    }

 */

    @PostMapping(value = "/Automatedtests")
    public ResponseEntity<Automatedtests> readXmlFile(@RequestParam("file") File readFile,@RequestParam("teamname") String teamname,
                                              @RequestParam("projectname") String projectname,@RequestParam("product") String product) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String readContent = new String(Files.readAllBytes(Paths.get(readFile.getPath().replaceAll("@",""))));

        // deserialize from the XML into a Automated object
        Automatedtests deserializedData = xmlMapper.readValue(readContent, Automatedtests.class);
        deserializedData.setTeamname(teamname);
        deserializedData.setProjectname(projectname);
        deserializedData.setProduct(product);
        automatedtestsRepository.save(deserializedData);
        return ResponseEntity.ok(deserializedData);
}

    @GetMapping(value = "Automatedtests/totals",produces = APPLICATION_JSON_VALUE)
    public List<Automatedtests> getautomated() {
        return automatedtestsService.getall();
    }
   /* @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public String fileUpload(@RequestParam("file") MultipartFile file, @RequestParam("files") MultipartFile[] files) {
        return null;
    }*/

    @PostMapping("/Automatedtests1")
    public Automatedtests uploadFile(
            @RequestParam("file") MultipartFile uploadfile,@RequestBody Automatedtests automatedtests) {
        return automatedtestsRepository.save (automatedtests);

    }
}

