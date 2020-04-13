package com.zarate.bean.kingdom;

import org.springframework.stereotype.Component;

import com.zarate.bean.service.TroopsService;

@Component
public class GreatBritain implements Kingdom {
	
	private String name = "Great Britain";

	private TroopsService troops;

	public GreatBritain(TroopsService troops) {
		this.troops = troops;
		System.out.printf("Size of the army: %s\n", this.troops.getArmy());
		System.out.printf("Size of the navy: %s\n", this.troops.getNavy());
	}

	/* No default constructor found; nested exception is java.lang.NoSuchMethodException: com.zarate.bean.kingdom.RussianEmpire.<init>()
	 * This exception will be throw if you put two constructors with our @Autowired*/
	public GreatBritain(String message) {
		System.out.println(message);
	}
	
	public GreatBritain() {
		System.out.println("Great Britain forgot your troops");
	}

	@Override
	public String getName() {
		return this.name;
	}

}
