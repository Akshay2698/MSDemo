package com.ms.demo.aem.core.models.Impl;

import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.ms.demo.aem.core.models.BoardMembers;
import com.ms.demo.aem.core.models.BoardMembersPojo;


@Model(adaptables = Resource.class, adapters = BoardMembers.class, 
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
resourceType = BoardMembersImpl.RESOURCE_TYPE)
public class BoardMembersImpl implements BoardMembers{

	protected final static String RESOURCE_TYPE = "msDemo/components/boardmemberscards";
	
	@ChildResource
	@Named("boardmembers")
	private List<BoardMembersPojo> boardmembers;
	
	@Override
	public List<BoardMembersPojo> getBoardMembersDetails() {
		return boardmembers;
	}

}
