package com.sts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {
	
	private  List<Topic> topics = new ArrayList<> (Arrays.asList(
	
			new Topic("spring","Framework","nice"),
			new Topic("Java","Core Java","Great"),
			new Topic("JS","JavaScript","Simple")
			
			));
	public List<Topic> getllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		// TODO Auto-generated method stub
		
	}

	public void updateTopic(String id, Topic topic) {
		for (int i=0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
			
		}
		// TODO Auto-generated method stub
		
	}

	public Topic deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
