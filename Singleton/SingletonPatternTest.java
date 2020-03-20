package com.DesignPattern.Singleton;

public class SingletonPatternTest 
{	
	public static void main(String[] args) 
	{
		//EAGER INITIALISATION
		EagerInitialisation eagerObj = EagerInitialisation.getInstance();
		EagerInitialisation eagerObj1 = EagerInitialisation.getInstance();
		eagerObj.show();
		System.out.println(eagerObj.hashCode());
		System.out.println(eagerObj1.hashCode());
		//STATIC BLOCK INTIALISATION
		StaticBlockInitialisation staticBlock=StaticBlockInitialisation .getInstance();
		staticBlock.show();
		//LAZY INITIALISATION
		LazyInitialisation lazyObj=LazyInitialisation.getInstance();
		lazyObj.show();

	}
}