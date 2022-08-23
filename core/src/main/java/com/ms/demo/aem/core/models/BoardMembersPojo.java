package com.ms.demo.aem.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BoardMembersPojo {

	@ValueMapValue
	private String backgroundimage;
	@ValueMapValue
	private String name;
	@ValueMapValue
	private String designation;
	@ValueMapValue
	private String buttonUrl;
	
	
	public String getBackgroundImage() {
		return backgroundimage;
	}

	public String getName() {
		return name;
	}
	
	public String getDesignation() {
		return designation;
	}

	public String getButtonUrl() {
		return buttonUrl;
	}
}
