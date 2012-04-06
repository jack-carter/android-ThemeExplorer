package com.maniac.android.tools;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

import android.util.TypedValue;

public class TypedValueDescriptor
{
	public TypedValueDescriptor() { value = new TypedValue(); }
	public TypedValueDescriptor(TypedValue _value) { value = _value; }
	public TypedValue value() { return value; }
	
	public String id() 		 { return value == null ? null : hex(value.resourceId); }
	public String type() 	 { return value == null ? null : type(value.type); }
	public String data() 	 { return value == null ? null : hex(value.data); }
	public String toString() { return value == null ? null : stringValue(); }
	
	private TypedValue value;

	// Implementation support
	
	private String stringValue()
	{
		String v = new Formatter().format("0x%08X",value.data).toString();
		
		switch (value.type)
		{
		case TypedValue.TYPE_INT_BOOLEAN:	v = value.data == 0 ? "false" : "true"; break;
		case TypedValue.TYPE_STRING:		v = (value.string == null ? null : value.string.toString()); break;
		}
		
		return v;
	}
	
	static private String hex(int _value)
	{
		return new Formatter().format("0x%08X",_value).toString();
	}
	
	static private final String type(int _type)
    {
    	String type = types().get(_type);
    	return type == null ? "<unknown>" : type;
    }    

    static private final Map<Integer,String> types()
    {
    	if ( types == null )
    	{
    		types = new HashMap<Integer,String>();
    		
    		types.put(android.util.TypedValue.COMPLEX_MANTISSA_MASK, "COMPLEX_MANTISSA_MASK");
       		types.put(android.util.TypedValue.COMPLEX_MANTISSA_SHIFT, "COMPLEX_MANTISSA_SHIFT");
       		types.put(android.util.TypedValue.COMPLEX_RADIX_0p23, "COMPLEX_RADIX_0p23");
       		types.put(android.util.TypedValue.COMPLEX_RADIX_16p7, "COMPLEX_RADIX_16p7");
       		types.put(android.util.TypedValue.COMPLEX_RADIX_23p0, "COMPLEX_RADIX_23p0");
       		types.put(android.util.TypedValue.COMPLEX_RADIX_8p15, "COMPLEX_RADIX_8p15");
       		types.put(android.util.TypedValue.COMPLEX_RADIX_MASK, "COMPLEX_RADIX_MASK");
       		types.put(android.util.TypedValue.COMPLEX_RADIX_SHIFT, "COMPLEX_RADIX_SHIFT");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_DIP, "COMPLEX_UNIT_DIP");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_FRACTION, "COMPLEX_UNIT_FRACTION");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_FRACTION_PARENT, "COMPLEX_UNIT_FRACTION_PARENT");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_IN, "COMPLEX_UNIT_IN");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_MASK, "COMPLEX_UNIT_MASK");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_MM, "COMPLEX_UNIT_MM");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_PT, "COMPLEX_UNIT_PT");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_PX, "COMPLEX_UNIT_PX");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_SHIFT, "COMPLEX_UNIT_SHIFT");
       		types.put(android.util.TypedValue.COMPLEX_UNIT_SP, "COMPLEX_UNIT_SP");
       		types.put(android.util.TypedValue.DENSITY_DEFAULT, "DENSITY_DEFAULT");
       		types.put(android.util.TypedValue.DENSITY_NONE, "DENSITY_NONE");
       		types.put(android.util.TypedValue.TYPE_ATTRIBUTE, "TYPE_ATTRIBUTE");
       		types.put(android.util.TypedValue.TYPE_DIMENSION, "TYPE_DIMENSION");
       		types.put(android.util.TypedValue.TYPE_FIRST_COLOR_INT, "TYPE_FIRST_COLOR_INT");
       		types.put(android.util.TypedValue.TYPE_FIRST_INT, "TYPE_FIRST_INT");
       		types.put(android.util.TypedValue.TYPE_FLOAT, "TYPE_FLOAT");
       		types.put(android.util.TypedValue.TYPE_FRACTION, "TYPE_FRACTION");
       		types.put(android.util.TypedValue.TYPE_INT_BOOLEAN, "TYPE_INT_BOOLEAN");
       		types.put(android.util.TypedValue.TYPE_INT_COLOR_ARGB4, "TYPE_INT_COLOR_ARGB4");
       		types.put(android.util.TypedValue.TYPE_INT_COLOR_ARGB8, "TYPE_INT_COLOR_ARGB8");
       		types.put(android.util.TypedValue.TYPE_INT_COLOR_RGB4, "TYPE_INT_COLOR_RGB4");
       		types.put(android.util.TypedValue.TYPE_INT_COLOR_RGB8, "TYPE_INT_COLOR_RGB8");
       		types.put(android.util.TypedValue.TYPE_INT_DEC, "TYPE_INT_DEC");
       		types.put(android.util.TypedValue.TYPE_INT_HEX, "TYPE_INT_HEX");
       		types.put(android.util.TypedValue.TYPE_LAST_COLOR_INT, "TYPE_LAST_COLOR_INT");
       		types.put(android.util.TypedValue.TYPE_LAST_INT, "TYPE_LAST_INT");
       		types.put(android.util.TypedValue.TYPE_NULL, "TYPE_NULL");
       		types.put(android.util.TypedValue.TYPE_REFERENCE, "TYPE_REFERENCE");
       		types.put(android.util.TypedValue.TYPE_STRING, "TYPE_STRING");
       	}
    	
    	return types;
    }
    
    static private Map<Integer,String> types;
}      
