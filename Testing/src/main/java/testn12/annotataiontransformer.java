package testn12;

import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.yaml.snakeyaml.constructor.Constructor;

public class annotataiontransformer implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testconstructor,Method testmethod)
	{
		if(isTestConfigured(annotation))
		{
			annotation.setEnabled(false);			
		}
}
	private boolean isTestConfigured(ITestAnnotation m) {
		if(m.getAlwaysRun())
		{
			return true;
		}		
		return false;
	}
}


