package org.tcs.test.Newone;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({App.class})
public class Execute {
	
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(App.class,pop.class);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("the failure count is :"+failureCount);
		
		long runTime = runClasses.getRunTime();
		System.out.println("the runtime is:"+runTime);
		
		
		int runCount = runClasses.getRunCount();
		System.out.println("the runcount is :"+runCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("the ignore count is :"+ignoreCount);
		
		List<Failure> failures = runClasses.getFailures();
        for(Failure x:failures) {
        	
        	System.out.println(x);
        	
        	boolean wasSuccessful = runClasses.wasSuccessful();
        	System.out.println("my case is sucessful :"+wasSuccessful);
        }
        
        
        
	
	}
	

}
