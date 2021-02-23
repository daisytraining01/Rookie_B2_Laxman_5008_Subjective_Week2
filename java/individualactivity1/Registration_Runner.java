package individualactivity1;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

 


@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
//@Cucumber.Options( format={"json:target/cucumber/cucumber.json"}) 
@Cucumber.Options(
        dryRun= false,
        monochrome=true,
        
        format = {"pretty", "html:target/cucumber"}) 

public class Registration_Runner {

}
