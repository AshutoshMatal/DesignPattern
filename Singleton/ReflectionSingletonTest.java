package com.DesignPattern.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		EagerInitialisation instanceOne = EagerInitialisation.getInstance();
		EagerInitialisation instanceTwo = EagerInitialisation.getInstance();
		try {
			Constructor [] constructor = EagerInitialisation.class.getDeclaredConstructors();
			for (Constructor constructor2 : constructor) {
				constructor2.setAccessible(true);
				instanceTwo = (EagerInitialisation) constructor2.newInstance();
				break;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

	}
}

