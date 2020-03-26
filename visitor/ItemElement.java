package com.DesignPattern.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);

}