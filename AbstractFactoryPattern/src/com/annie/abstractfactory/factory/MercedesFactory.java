package com.annie.abstractfactory.factory;

import com.annie.abstractfactory.headlight.Headlight;
import com.annie.abstractfactory.headlight.MercedesHeadlight;
import com.annie.abstractfactory.tire.MercedesTire;
import com.annie.abstractfactory.tire.Tire;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
