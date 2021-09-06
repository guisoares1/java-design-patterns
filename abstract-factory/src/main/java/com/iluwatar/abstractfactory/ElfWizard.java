package com.iluwatar.abstractfactory;

public class ElfWizard implements Wizard {
	  static final String DESCRIPTION = "This is the elf wizard!";

	  @Override
	  public String getDescription() {
	    return DESCRIPTION;
	  }

}
