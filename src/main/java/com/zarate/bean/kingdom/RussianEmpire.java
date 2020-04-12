package com.zarate.bean.kingdom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zarate.bean.service.TroopsService;

@Component
public class RussianEmpire {

	private TroopsService troops;

	@Autowired
	public RussianEmpire(TroopsService troops) {
		this.troops = troops;
		System.out.printf("Size of the army: %s\n", this.troops.getArmy());
		System.out.printf("Size of the navy: %s\n", this.troops.getNavy());
	}

	/* No default constructor found; nested exception is java.lang.NoSuchMethodException: com.zarate.bean.kingdom.RussianEmpire.<init>()
	 * This exception will be throw if you put two constructors with our @Autowired*/
	public RussianEmpire(String message) {
		System.out.println(message);
	}

}
