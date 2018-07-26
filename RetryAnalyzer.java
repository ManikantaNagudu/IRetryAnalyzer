package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int Counter=0;
	int retrylimit=4;	
	public boolean retry(ITestResult result) {
	if(Counter<retrylimit) {
		
		Counter++;
		return true;
	}
		return false;
	}

}
