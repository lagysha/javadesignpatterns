package org.example.behavioral.visitor;

public interface GeoElement {
	
	void accept(Visitor visitor);

}
