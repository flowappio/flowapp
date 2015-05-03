package com.flowapp.core;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class JerseyApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();

		s.add(org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.class);
		s.add(org.codehaus.jackson.jaxrs.JacksonJsonProvider.class);
		s.add(org.codehaus.jackson.jaxrs.JsonParseExceptionMapper.class);
		s.add(org.codehaus.jackson.jaxrs.JsonMappingExceptionMapper.class);
		return s;
	}
}
