package com.maniac.android.tools;

import android.util.TypedValue;

public class AttributeDescriptor extends TypedValueDescriptor
{
	public AttributeDescriptor(int _attr, TypedValue _value)
	{
		super(_value);
		
		ID = _attr;
		name = AndroidAttribute.name(_attr);
	}
	
	public int ID()			{ return ID; }
	public String name() 	{ return name; }
	
	private int ID;
	private String name;
};

