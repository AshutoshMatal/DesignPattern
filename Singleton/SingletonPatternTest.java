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
		// THREAD SAFE SINGLETON
		System.out.println("Thread safe ");
		ThreadSafeSingleton threadsafe = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadsafe1 = ThreadSafeSingleton.getInstance();
		System.out.println(threadsafe.hashCode());
		System.out.println(threadsafe1.hashCode());
		//BILL PUGH SINGLETON
		System.out.println("Bill pugh");
		BillPughSingleton billPughObj1 = BillPughSingleton.getInstance();
		BillPughSingleton billPughObj2 = BillPughSingleton.getInstance();
		System.out.println(billPughObj1.hashCode());
		System.out.println(billPughObj2.hashCode());
		// SERIALIZATION SINGLETON
		System.out.println("Serialization");
		SerializationSingleton instanceOne = SerializationSingleton.getInstance();
		SerializationSingleton instanceTwo = SerializationSingleton.getInstance();
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

	}
}