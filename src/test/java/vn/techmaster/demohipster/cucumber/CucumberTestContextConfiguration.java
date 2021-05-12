package vn.techmaster.demohipster.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import vn.techmaster.demohipster.DemohipsterApp;

@CucumberContextConfiguration
@SpringBootTest(classes = DemohipsterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
