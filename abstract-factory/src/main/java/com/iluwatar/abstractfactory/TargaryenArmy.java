package com.iluwatar.abstractfactory;

public class TargaryenArmy implements Army {

	  static final String DESCRIPTION = "This is the Targaryen army!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }
}
