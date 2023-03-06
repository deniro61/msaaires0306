package msaaires.common;


import msaaires.NotimgmtApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotimgmtApplication.class })
public class CucumberSpingConfiguration {
    
}
