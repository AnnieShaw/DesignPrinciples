package com.annie.abstractfactory.factorygetter;

import com.annie.abstractfactory.factory.AudiFactory;
import com.annie.abstractfactory.factory.Factory;
import com.annie.abstractfactory.factory.MercedesFactory;

public class FactoryGetter {
	public static Factory getFactory(String company) {
		
		if(company.equalsIgnoreCase("Audi")) {
			return new AudiFactory();
		}
		else if(company.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		return null;
	}
}
