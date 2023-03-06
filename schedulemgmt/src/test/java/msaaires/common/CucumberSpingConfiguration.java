package msaaires.common;


import msaaires.SchedulemgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SchedulemgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
