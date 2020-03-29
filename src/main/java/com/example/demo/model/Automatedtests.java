package com.example.demo.model;



import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Testsuite.
 */
@Entity
@Table(name = "Automatedtest")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Automatedtests implements Serializable {

    private static final long serialVersionUID = 1L;

    public Automatedtests(Long id, String name, Long tests, Long failures, Long errors, Long time, Long skipped, String timestamp,
                          String hostname,String teamname,String projectname,String product){
        this.id  = id;
        this.name = name;
        this.tests = tests;
        this.failures = failures;
        this.errors = errors;
        this.time = time;
        this.skipped=skipped;
        this.timestamp = timestamp;
        this.hostname = hostname;
        this.teamname = teamname;
        this.product=product;
        this.projectname=projectname;
    }

    public Automatedtests(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "tests")
    private Long tests;

    @Column(name = "failures")
    private Long failures;

    @Column(name = "errors")
    private Long errors;

    @Column(name = "jhi_time")
    private Long time;

    @Column(name = "skipped")
    private Long skipped;

    @Column(name = "jhi_timestamp")
    private String timestamp;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "teamname")
     private String teamname;

    @Column(name = "projectname")
    private String projectname;

    @Column(name = "product")
    private String product;


    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getSkipped() {
        return skipped;
    }
    public void setSkipped(Long skipped) {
        this.skipped = skipped;
    }

    public Automatedtests name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTests() {
        return tests;
    }

    public Automatedtests tests(Long tests) {
        this.tests = tests;
        return this;
    }

    public void setTests(Long tests) {
        this.tests = tests;
    }

    public Long getFailures() {
        return failures;
    }

    public Automatedtests failures(Long failures) {
        this.failures = failures;
        return this;
    }

    public void setFailures(Long failures) {
        this.failures = failures;
    }

    public Long getErrors() {
        return errors;
    }

    public Automatedtests errors(Long errors) {
        this.errors = errors;
        return this;
    }

    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    public Automatedtests team(String teamname) {
        this.teamname = teamname;
        return this;
    }

    public String getProjectname() {
        return projectname;
    }
    public Automatedtests projectname(String projectname) {
        this.projectname = projectname;
        return this;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProduct() {
        return product;
    }
    public Automatedtests product(String product) {
        this.product = product;
        return this;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public void setErrors(Long errors) {
        this.errors = errors;
    }

    public Long getTime() {
        return time;
    }

    public Automatedtests time(Long time) {
        this.time = time;
        return this;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public Automatedtests timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHostname() {
        return this.hostname;
    }

    public Automatedtests hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Automatedtests automatedtests = (Automatedtests) o;
        if (automatedtests.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), automatedtests.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Testsuite{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", tests=" + getTests() +
                ", failures=" + getFailures() +
                ", errors=" + getErrors() +
                ", time=" + getTime() +
                ", timestamp='" + getTimestamp() + "'" +
                ", hostname='" + getHostname() + "'" +
                "}";
    }
}
