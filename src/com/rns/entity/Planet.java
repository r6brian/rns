package com.rns.entity;

public enum Planet {

	VENUS("venus", 0.78f),
	JUPITER("jupiter", 2.65f),
	EARTH("earth", 1.0f);

	private final String _Name;
	private final float _Gravity;
	
	private Planet(String name, float gravity) {
		_Name = name;
		_Gravity = gravity;
	}
	
	public final String getName() {
		return _Name;
	}

	public final float getGravity() {
		return _Gravity;
	}
}

