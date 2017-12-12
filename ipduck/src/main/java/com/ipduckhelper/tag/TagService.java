package com.ipduckhelper.tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService {

	@Autowired
	private TagRepository tagRepository;
	
	public Integer Crt_Tag(Tag entity) throws Exception{
		return tagRepository.Crt_Tag(entity);
	}
	
	public List<Tag> Srch_Tag_List(Tag entity) throws Exception{
		return tagRepository.Srch_Tag_List(entity);
	}
}
