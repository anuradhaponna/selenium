package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Testtransformer implements IAnnotationTransformer {
	
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




