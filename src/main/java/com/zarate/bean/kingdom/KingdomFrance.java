package com.zarate.bean.kingdom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zarate.bean.service.TroopsService;

@Component
public class KingdomFrance {

	private TroopsService troops;

	public KingdomFrance(TroopsService troops) {
		this.troops = troops;
	}

	/* No default constructor found; nested exception is java.lang.NoSuchMethodException: com.zarate.bean.kingdom.RussianEmpire.<init>()
	 * This exception will be throw if you put two constructors with our @Autowired*/
	public KingdomFrance(String message) {
		System.out.println(message);
	}
	
	public KingdomFrance() {
		System.out.println("Kindom of France forgot your troops");
	}

	@Autowired
	public void setTroops(TroopsService troops) {
		this.troops = troops;
		System.out.printf("Kingdom of France's Size of the army: %s\n", this.troops.getArmy());
		System.out.printf("Kingdom of France's Size of the navy: %s\n", this.troops.getNavy());
	}

}
