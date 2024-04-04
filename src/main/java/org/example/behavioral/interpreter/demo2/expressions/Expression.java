package org.example.behavioral.interpreter.demo2.expressions;

import org.example.behavioral.interpreter.demo2.Employee;

public interface Expression {
	
	boolean interpret(Employee context);
}
