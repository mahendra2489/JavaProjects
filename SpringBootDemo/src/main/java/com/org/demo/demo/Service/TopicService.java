package com.org.demo.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.org.demo.demo.Model.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("java","Java","Java Description"),
											new Topic("spring","Spring","Spring Framework Description"),
											new Topic("javascript","Java Script","Java Script Description")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<=topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
			
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}

}
