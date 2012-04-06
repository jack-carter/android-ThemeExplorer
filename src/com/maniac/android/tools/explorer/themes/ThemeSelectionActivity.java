package com.maniac.android.tools.explorer.themes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.maniac.android.tools.*;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

/**
 * This class lists the themes available on this device, and allows a user to select a theme
 * for demonstration.
 */
public class ThemeSelectionActivity extends ListActivity 
{
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setListAdapter(adapter());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	if ( menu != null )
    	{
    		menu.clear();
    		menu.add(0, 0, 0, "Dump themes");
    	}
    	    	
    	return super.onCreateOptionsMenu(menu);
    }
    
	@Override
	public boolean onOptionsItemSelected(MenuItem _item)
	{
		return onOptionsItemSelected(_item);
	}
	
	@Override
	protected void onListItemClick(ListView _list, View _view, int _position, long _id) 
	{
		@SuppressWarnings("unchecked")
		Map<String,Object> item = (Map<String,Object>) getListAdapter().getItem(_position);		
		Toast.makeText(this,item.get(NAME).toString(), Toast.LENGTH_SHORT).show();
		startActivity( new Intent(this,ThemeDetailsActivity.class).putExtra("theme.id", (Integer)item.get(ID)) );
	}		

	protected ListAdapter adapter()
    {
    	return new SimpleAdapter(this,contents(),android.R.layout.simple_list_item_2,new String[] { NAME, ID },new int[]{ android.R.id.text1, android.R.id.text2 });
    }
    
    protected List<Map<String,Object>> contents()
    {
    	List<Map<String,Object>> themes = new ArrayList<Map<String,Object>>();
    	
    	for ( Integer id : AndroidTheme.IDs(AndroidTheme.VERTICAL) )
    		themes.add( newEntry( id, AndroidTheme.name(id) ) );
    	
    	return themes;
    }

    protected Map<String,Object> newEntry(Integer _id, String _name)
    {
    	Map<String,Object> map = new HashMap<String,Object>();
    	
    	map.put(ID, _id);
    	map.put(NAME, _name);
    	
    	return map;
    }  

	static private final String ID = "ID";
	static private final String NAME = "NAME";	
}