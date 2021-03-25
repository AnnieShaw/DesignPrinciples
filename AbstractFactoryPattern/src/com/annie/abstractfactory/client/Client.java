package com.annie.abstractfactory.client;

import com.annie.abstractfactory.factory.Factory;
import com.annie.abstractfactory.factorygetter.FactoryGetter;
import com.annie.abstractfactory.headlight.AudiHeadlight;
import com.annie.abstractfactory.headlight.Headlight;
import com.annie.abstractfactory.headlight.MercedesHeadlight;
import com.annie.abstractfactory.tire.AudiTire;
import com.annie.abstractfactory.tire.MercedesTire;
import com.annie.abstractfactory.tire.Tire;

public class Client {

	public static void main(String[] args) {

		Factory audiFactory = FactoryGetter.getFactory("Audi");
		Tire audiTire = audiFactory.makeTire();
		Headlight audiHeadlight = audiFactory.makeHeadlight();
		if(audiTire instanceof AudiTire && audiHeadlight instanceof AudiHeadlight) {
			System.out.println("Tire and Headlight of Audi");
		}
		
		Factory mercedesFactory = FactoryGetter.getFactory("Mercedes");
		Tire mercedesTire = mercedesFactory.makeTire();
		Headlight mercedesHeadlight = mercedesFactory.makeHeadlight();
		if(mercedesTire instanceof MercedesTire && mercedesHeadlight instanceof MercedesHeadlight) {
			System.out.println("Tire and Headlight of Mercedes");
		}
	}

}
