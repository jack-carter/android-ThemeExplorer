package com.maniac.android.tools;

import java.util.HashMap;
import java.util.Map;

public abstract class AndroidAttribute
{
	static public final String name(int _attr)
	{
		String name = attributes().get(_attr);
		return name == null ? "<unknown>" : name;
	}
	
	static private final Map<Integer,String> attributes()
	{
		if ( attributes == null )
		{
			attributes = new HashMap<Integer,String>();
			
    		attributes.put( android.R.attr.windowNoTitle, 			"windowNoTitle" );
    		attributes.put( android.R.attr.actionBarStyle, 			"actionBarStyle" );
    		attributes.put( android.R.attr.actionBarDivider, 		"actionBarDivider" );
    		attributes.put( android.R.attr.actionBarItemBackground, "actionBarItemBackground" );
    		attributes.put( android.R.attr.actionBarSize, 			"actionBarSize" );
    		attributes.put( android.R.attr.actionBarSplitStyle, 	"actionBarSplitStyle" );
    		attributes.put( android.R.attr.actionBarStyle, 			"actionBarStyle" );
    		attributes.put( android.R.attr.actionBarTabBarStyle, 	"actionBarTabBarStyle" );
    		attributes.put( android.R.attr.actionBarTabStyle, 		"actionBarTabStyle" );
    		attributes.put( android.R.attr.actionBarTabTextStyle, 	"actionBarWidgetTheme" );    		    			
		}
		
		return attributes;
	}
	
	static private Map<Integer,String> attributes;
}
