package com.maniac.android.tools.explorer.themes;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.maniac.android.tools.AndroidTheme;
import com.maniac.android.tools.AttributeDescriptor;
import com.maniac.android.tools.Log;
import com.maniac.android.tools.ThemeDescriptor;


public class ThemeDetailsActivity extends ListActivity 
{
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
		int theme = getIntent().getExtras().getInt("theme.id");
		
		setTheme(theme);
		
		Toast.makeText(this, "theme=" + (this.theme = AndroidTheme.name(theme)), Toast.LENGTH_SHORT);

		super.onCreate(savedInstanceState);
		setListAdapter(adapter());
	}
	
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	return super.onCreateOptionsMenu(menu);    	
    }
    
    @Override
    public boolean onPrepareOptionsMenu(Menu menu)
    {
    	if ( menu != null )
    	{
    		menu.clear();
    		menu.add(0, 0, 0, "Gingerbread");
    		menu.add(0, 1, 0, "Ice Cream Sandwich");
    	}
    	
    	return true;
    }  
    
	@Override
	public boolean onOptionsItemSelected(MenuItem _item)
	{
		Log.i( new Formatter().format("theme=%s, style=%s",theme, (_item.getItemId() == 0 ? "HORIZONTAL" : "VERTICAL")).toString() );
		
		finish();
		
		return super.onOptionsItemSelected(_item);
	}

	static private final String ATTR = "ATTR";
    static private final String VALUE = "VALUE";
    
    protected ListAdapter adapter()
    {
    	return new SimpleAdapter(this,contents(),android.R.layout.simple_list_item_2,new String[] { ATTR, VALUE },new int[]{ android.R.id.text1, android.R.id.text2 });
    }
    
    protected List<Map<String,String>> contents()
    {
    	List<Map<String,String>> list = new ArrayList<Map<String,String>>();
    	
    	for ( AttributeDescriptor d : ThemeDescriptor.on(getTheme()).describe(attributes()))
    		list.add( newEntry( d.name(), d.toString() ));
    	
    	return list;
    }    

    protected Map<String,String> newEntry(String _name, String _value)
    {
    	Map<String,String> map = new HashMap<String,String>();
    	
    	map.put(ATTR, _name);
    	map.put(VALUE, _value);
    	
    	return map;
    }  
    
    protected int[] attributes()
    {
		return new int[] 
        { 
		android.R.attr.windowNoTitle,
		android.R.attr.actionBarStyle,
		android.R.attr.actionBarSize,
		android.R.attr.actionBarItemBackground,
		android.R.attr.actionBarDivider,
		android.R.attr.actionBarSplitStyle,
		android.R.attr.actionBarTabBarStyle,
		android.R.attr.actionBarTabStyle,
		android.R.attr.actionBarTabTextStyle,
		};
    }
    
    private String theme;
}
