package com.ms.demo.aem.core.models.Impl;

import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.ms.demo.aem.core.models.BusinessHighlights;
import com.ms.demo.aem.core.models.BusinessHighlightsPojo;


@Model(adaptables = Resource.class, adapters = BusinessHighlights.class, 
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
resourceType = BusinessHighlightsImpl.RESOURCE_TYPE)
public class BusinessHighlightsImpl implements BusinessHighlights{

	protected final static String RESOURCE_TYPE = "msDemo/components/businesshighlights";
	
	@ChildResource
	@Named("businesshighlightsdetails")
	private List<BusinessHighlightsPojo> businesshighlightsdetails;
	
	
	@Override
	public List<BusinessHighlightsPojo> getBusinessHighlightsDetails() {
		// TODO Auto-generated method stub
		return businesshighlightsdetails;
	}
	
	
	
	
	
	

}
