package hahaa;

import java.util.ArrayList;
import java.util.List;



public class Call {
	public List<Call> callsHistory = new ArrayList<Call>() ;
	private String callName;
    private float callTime;
    
    public Call(String callName, float callTime)
{
    	this.callName = callName;
    	this.callTime = callTime;
}

	public String getCallName() {
		return callName;
	}

	public void setCallName(String callName) {
		this.callName = callName;
	}

	public float getCallTime() {
		return callTime;
	}

	public void setCallTime(float callTime) {
		this.callTime = callTime;
	}
    
}

