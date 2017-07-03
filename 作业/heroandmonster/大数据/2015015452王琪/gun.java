package com;

public  class gun implements weapon{
	public int addAttack(){
		return 40;
	}

	@Override
	public int addPower() {
		return 0;
	}
}
