package com.annie.abstractfactory.factory;

import com.annie.abstractfactory.headlight.Headlight;
import com.annie.abstractfactory.tire.Tire;

public abstract class Factory {

	public abstract Headlight makeHeadlight();

	public abstract Tire makeTire();
}
