package com.iluwatar.abstractfactory;

public class TargaryenKing implements King {
	  static final String DESCRIPTION = "This is the Daenerys Targaryen king!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}
