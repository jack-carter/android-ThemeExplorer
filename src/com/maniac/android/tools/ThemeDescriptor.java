package com.maniac.android.tools;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;

public class ThemeDescriptor 
{
	static public ThemeDescriptor on(Resources.Theme _theme)
	{
		return new ThemeDescriptor(_theme);
	}
	
	public ThemeDescriptor(Resources.Theme _theme)
	{
		theme = _theme;
	}
	
	public AttributeDescriptor[] describe(int attr[])
	{
		List<AttributeDescriptor> attributes = new ArrayList<AttributeDescriptor>();
		
		TypedArray values = theme().obtainStyledAttributes( attr );
		
		for ( int n=0; n < attr.length; n++ ) {
			if ( values.hasValue(n) ) {
				TypedValue value = new TypedValue();
				if ( values.getValue(n,value) )
					attributes.add( new AttributeDescriptor(attr[n],value) );
			}
		}
		
		values.recycle();

		return attributes.toArray( new AttributeDescriptor[0] );
	}
	
	private Resources.Theme theme()
	{
		return theme;
	}
	
	private Resources.Theme theme;
}
