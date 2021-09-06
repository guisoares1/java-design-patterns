package com.iluwatar.abstractfactory;

public class TargaryenKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new TargaryenCastle();
	}

	@Override
	public King createKing() {
		// TODO Auto-generated method stub
		return new TargaryenKing();
	}

	@Override
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new TargaryenArmy();
	}

	@Override
	public Wizard CreateWizard() {
		// TODO Auto-generated method stub
		return new TargaryenWizardWizard();
	}

}
