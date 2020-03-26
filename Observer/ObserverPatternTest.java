package com.DesignPattern.Observer;

public class ObserverPatternTest
{
	public static void main(String[] args) 
	{
		MyTopic topic = new MyTopic();
		Observer obj = new MyTopicSubscriber("obj");
		Observer obj1 = new MyTopicSubscriber("obj1");
		Observer obj2 = new MyTopicSubscriber("obj2");

		topic.register(obj);
		topic.register(obj1);
		topic.register(obj2);

		obj.setSubject(topic);
		obj1.setSubject(topic);
		obj2.setSubject(topic);

		obj.update();
		topic.postMessage("new message");
	}

}



