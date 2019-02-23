package com.matthewallbee.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TestService
{
	@WebMethod
	public String test1();
	@WebMethod
	public String test2(String s);
}
