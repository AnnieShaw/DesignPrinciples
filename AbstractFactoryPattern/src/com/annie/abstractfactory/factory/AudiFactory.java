package com.annie.abstractfactory.factory;

import com.annie.abstractfactory.headlight.AudiHeadlight;
import com.annie.abstractfactory.headlight.Headlight;
import com.annie.abstractfactory.tire.AudiTire;
import com.annie.abstractfactory.tire.Tire;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}

}
