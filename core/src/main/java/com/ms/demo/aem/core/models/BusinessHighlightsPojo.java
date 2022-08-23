package com.ms.demo.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BusinessHighlightsPojo {
	
	@ValueMapValue
	private String serialnumber;
	@ValueMapValue
	private String highlightsdesc;
	
	
	public String getSerialNumber() {
		return serialnumber;
	}

	public String getHighlightsdesc() {
		return highlightsdesc;
	}
}
