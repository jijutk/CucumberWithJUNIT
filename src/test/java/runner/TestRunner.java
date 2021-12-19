package runner;


//import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = {"src/test/java/appFeature"},
        glue = {"stepDefinitions"},
		//tags = {"~@Ignore"},
        //format = {"pretty"},
		plugin = {	"pretty"
					}
		


)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	
}	
	
//	@Override 
//	@DataProvider(parallel=false)
//	public Object[] [] scenarios() {
//		return super.scenarios();
//	}
	
//	private TestNGCucumberRunner testNGCucumberRunner;
//	
//	@BeforeClass() 
//		public void setUpClass() {
//			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//			
//		}
//	@Test(dataProvider="features")
//	public void my_test(CucumberFeatureWrapper cucumberFeature){
//		testNGCucumberRunner.runScenario()
//	}
//	
//	
//	@DataProvider
//	public Object[][] features() {
//		return testNGCucumberRunner.provideScenarios();
//	
//	}

//	@AfterClass
	//public void tearDown() {
		//testNGCucumberRunner.finish();
	//}

