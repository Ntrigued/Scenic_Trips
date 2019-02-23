package com.matthewallbee.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.matthewallbee.ws.TestService;

public class TestServiceImpl implements TestService
{
	@WebMethod
	public String test1()
	{
		return "You have successfully called the test1 method!";
	}

	@WebMethod
	public String test2(String inputStr)
	{
		return "You have passed \"" + inputStr + "\" into the test2 methodz";
	}
}
