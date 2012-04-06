package com.maniac.android.tools;

import java.util.HashMap;
import java.util.Map;

public class AndroidTheme
{
	static public String name(int _theme)
	{
		return themes().get(_theme);
	}
	
	static public Integer[] IDs()
	{
		return themes().keySet().toArray( new Integer[1] );
	}
	
	static private Map<Integer,String> themes()
	{
		if ( themes == null )
		{
			themes = new HashMap<Integer,String>();
			
			themes.put(android.R.style.Theme, "Theme");
			themes.put(android.R.style.Theme_NoDisplay, "Theme.Light.NoDisplay");
			themes.put(android.R.style.Theme_Dialog, "Theme.Dialog");
			themes.put(android.R.style.Theme_InputMethod, "Theme.InputMethod");
			themes.put(android.R.style.Theme_Panel, "Theme.Panel");
			themes.put(android.R.style.Theme_WithActionBar, "Theme.WithActionBar");
			themes.put(android.R.style.Theme_NoTitleBar, "Theme.NoTitleBar");
			themes.put(android.R.style.Theme_NoTitleBar_Fullscreen, "Theme.NoTitleBar.Fullscreen");
			themes.put(android.R.style.Theme_NoTitleBar_OverlayActionModes, "Theme.NoTitleBar.OverlayActionModes");
			themes.put(android.R.style.Theme_Translucent, "Theme.Translucent");
			themes.put(android.R.style.Theme_Translucent_NoTitleBar, "Theme.Translucent.NoTitleBar");
			themes.put(android.R.style.Theme_Translucent_NoTitleBar_Fullscreen, "Theme.Translucent.NoTitleBar.Fullscreen");
			themes.put(android.R.style.Theme_Wallpaper, "Theme.Wallpaper");
			themes.put(android.R.style.Theme_WallpaperSettings, "Theme.WallpaperSettings");
			themes.put(android.R.style.Theme_Wallpaper_NoTitleBar, "Theme.Wallpaper.NoTitleBar");
			themes.put(android.R.style.Theme_Wallpaper_NoTitleBar_Fullscreen, "Theme.Wallpaper.NoTitleBar.Fullscreen");
			themes.put(android.R.style.Theme_Black, "Theme.Black");
			themes.put(android.R.style.Theme_Black_NoTitleBar, "Theme.Black.NoTitleBar");
			themes.put(android.R.style.Theme_Black_NoTitleBar_Fullscreen, "Theme.Black.NoTitleBar.Fullscreen");
			themes.put(android.R.style.Theme_Light, "Theme.Light");
			themes.put(android.R.style.Theme_Light_NoTitleBar, "Theme.Light.NoTitleBar");
			themes.put(android.R.style.Theme_Light_NoTitleBar_Fullscreen, "Theme.Light.NoTitleBar.Fullscreen");
			themes.put(android.R.style.Theme_Light_Panel, "Theme.Light.Panel");
			themes.put(android.R.style.Theme_Light_WallpaperSettings, "Theme.Light.WallpaperSettings");

			themes.put(android.R.style.Theme_DeviceDefault, "Theme.DeviceDefault");
			themes.put(android.R.style.Theme_DeviceDefault_Dialog, "Theme.DeviceDefault.Dialog");
			themes.put(android.R.style.Theme_DeviceDefault_DialogWhenLarge, "Theme.DeviceDefault.DialogWhenLarge");
			themes.put(android.R.style.Theme_DeviceDefault_DialogWhenLarge_NoActionBar, "Theme.DeviceDefault.DialogWhenLarge.NoActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_Dialog_MinWidth, "Theme.DeviceDefault.Dialog.MinWidth");
			themes.put(android.R.style.Theme_DeviceDefault_Dialog_NoActionBar, "Theme.DeviceDefault.Dialog.NoActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth, "Theme.DeviceDefault.Dialog.NoActionBar.MinWidth");
			themes.put(android.R.style.Theme_DeviceDefault_InputMethod, "Theme.DeviceDefault.InputMethod");
			themes.put(android.R.style.Theme_DeviceDefault_Light, "Theme.DeviceDefault.Light");
			themes.put(android.R.style.Theme_DeviceDefault_Light_DarkActionBar, "Theme.DeviceDefault.Light.DarkActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_Light_Dialog, "Theme.DeviceDefault.Light.Dialog");
			themes.put(android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge, "Theme.DeviceDefault.Light.DialogWhenLarge");
			themes.put(android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge_NoActionBar, "Theme.DeviceDefault.Light.DialogWhenLarge.NoActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth, "Theme.DeviceDefault.Light.Dialog.MinWidth");
			themes.put(android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar, "Theme.DeviceDefault.Light.Dialog.NoActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth, "Theme.DeviceDefault.Light.Dialog.NoActionBar.MinWidth");
			themes.put(android.R.style.Theme_DeviceDefault_Light_NoActionBar, "Theme.DeviceDefault.Light.NoActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen, "Theme.DeviceDefault.Light.NoActionBar.Fullscreen");
			themes.put(android.R.style.Theme_DeviceDefault_Light_Panel, "Theme.DeviceDefault.Light_Panel");
			themes.put(android.R.style.Theme_DeviceDefault_NoActionBar, "Theme.DeviceDefault.NoActionBar");
			themes.put(android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen, "Theme.DeviceDefault.NoActionBar.Fullscreen");
			themes.put(android.R.style.Theme_DeviceDefault_Panel, "Theme.DeviceDefault.Panel");
			themes.put(android.R.style.Theme_DeviceDefault_Wallpaper, "Theme.DeviceDefault.Wallpaper");
			themes.put(android.R.style.Theme_DeviceDefault_Wallpaper_NoTitleBar, "Theme.DeviceDefault.Wallpaper.NoTitleBar");

			themes.put(android.R.style.Theme_Holo, "Theme.Holo");
			themes.put(android.R.style.Theme_Holo_Dialog, "Theme.Holo.Dialog");
			themes.put(android.R.style.Theme_Holo_DialogWhenLarge, "Theme.Holo.DialogWhenLarge");
			themes.put(android.R.style.Theme_Holo_DialogWhenLarge_NoActionBar, "Theme.Holo.DialogWhenLarge.NoActionBar");
			themes.put(android.R.style.Theme_Holo_Dialog_MinWidth, "Theme.Holo.Dialog.MinWidth");
			themes.put(android.R.style.Theme_Holo_Dialog_NoActionBar, "Theme.Holo.Dialog.NoActionBar");
			themes.put(android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth, "Theme.Holo.Dialog.NoActionBar.MinWidth");
			themes.put(android.R.style.Theme_Holo_InputMethod, "Theme.Holo.InputMethod");
			themes.put(android.R.style.Theme_Holo_Light, "Theme.Holo.Light");
			themes.put(android.R.style.Theme_Holo_Light_DarkActionBar, "Theme.Holo.Light.DarkActionBar");
			themes.put(android.R.style.Theme_Holo_Light_Dialog, "Theme.Holo.Light.Dialog");
			themes.put(android.R.style.Theme_Holo_Light_DialogWhenLarge, "Theme.Holo.Light.DialogWhenLarge");
			themes.put(android.R.style.Theme_Holo_Light_DialogWhenLarge_NoActionBar, "Theme.Holo.Light.DialogWhenLarge.NoActionBar");
			themes.put(android.R.style.Theme_Holo_Light_Dialog_MinWidth, "Theme.HoloLight.Dialog.MinWidth");
			themes.put(android.R.style.Theme_Holo_Light_Dialog_NoActionBar, "Theme.Holo.Light.Dialog.NoActionBar");
			themes.put(android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth, "Theme.Holo.Light_Dialog.NoActionBar.MinWidth");
			themes.put(android.R.style.Theme_Holo_Light_NoActionBar, "Theme.Holo.Light.NoActionBar");
			themes.put(android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen, "Theme.Holo.Light.NoActionBar.Fullscreen");
			themes.put(android.R.style.Theme_Holo_Light_Panel, "Theme.Holo.Light.Panel");
			themes.put(android.R.style.Theme_Holo_Light_NoActionBar, "Theme.Holo.Light.NoActionBar");
			themes.put(android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen, "Theme.Holo.Light.NoActionBar.Fullscreen");
			themes.put(android.R.style.Theme_Holo_Panel, "Theme.Holo.Panel");
			themes.put(android.R.style.Theme_Holo_Wallpaper, "Theme.Holo.Wallpaper");
			themes.put(android.R.style.Theme_Holo_Wallpaper_NoTitleBar, "Theme.Holo.Wallpaper.NoTitleBar");
		}
		
		return themes;
	}
	
	static public boolean HORIZONTAL = false;
	static public boolean VERTICAL = true;
	
	static public Integer[] IDs( boolean _orientation )
	{
		Integer[] themes = null;
		
		if ( _orientation == VERTICAL ) {
			themes = new Integer[] 
			{
			android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge_NoActionBar,
			android.R.style.Theme_DeviceDefault_Light_DialogWhenLarge,
			android.R.style.Theme_DeviceDefault_Light_DarkActionBar,
			android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen,
			android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth,
			android.R.style.Theme_DeviceDefault_Light_Dialog,
			android.R.style.Theme_DeviceDefault_Dialog_NoActionBar_MinWidth,
			android.R.style.Theme_DeviceDefault_Dialog_NoActionBar,
			android.R.style.Theme_DeviceDefault_DialogWhenLarge_NoActionBar,
			android.R.style.Theme_DeviceDefault_DialogWhenLarge,
			android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth,
			android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar,
			android.R.style.Theme_DeviceDefault_Light,
			android.R.style.Theme_DeviceDefault,
			android.R.style.Theme_DeviceDefault_NoActionBar,
			android.R.style.Theme_DeviceDefault_Dialog,
			android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
			android.R.style.Theme_DeviceDefault_Light_NoActionBar,
			android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen,
			android.R.style.Theme_Holo_Light,
			android.R.style.Theme_Holo_Dialog,
			android.R.style.Theme_Holo,
			android.R.style.Theme_Holo_Light_Dialog_NoActionBar,
			android.R.style.Theme_Holo_Light_Dialog_MinWidth,
			android.R.style.Theme_Holo_DialogWhenLarge,
			android.R.style.Theme_Holo_Light_Dialog_NoActionBar_MinWidth,
			android.R.style.Theme_Holo_Dialog_NoActionBar,
			android.R.style.Theme_Holo_Dialog_MinWidth,
			android.R.style.Theme_Holo_Light_Dialog,
			android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth,
			android.R.style.Theme_Holo_Wallpaper,
			android.R.style.Theme_Holo_Light_Panel,
			android.R.style.Theme_Holo_InputMethod,
			android.R.style.Theme_Holo_Wallpaper_NoTitleBar,
			android.R.style.Theme_Holo_Light_NoActionBar,
			android.R.style.Theme_Holo_Light_DialogWhenLarge,
			android.R.style.Theme_Holo_Light_NoActionBar_Fullscreen,
			android.R.style.Theme_Holo_DialogWhenLarge_NoActionBar,
			android.R.style.Theme_Holo_Panel,
			android.R.style.Theme_Holo_Light_DialogWhenLarge_NoActionBar,
			};
		} else {
			themes = new Integer[]
			{
			android.R.style.Theme_Light_NoTitleBar_Fullscreen,
			android.R.style.Theme_Translucent,
			android.R.style.Theme_Light,
			android.R.style.Theme_Light_NoTitleBar,
			android.R.style.Theme_Translucent_NoTitleBar_Fullscreen,
			android.R.style.Theme_Translucent_NoTitleBar,
			android.R.style.Theme_DeviceDefault_Light_Panel,
			android.R.style.Theme_DeviceDefault_Panel,
			android.R.style.Theme_DeviceDefault_InputMethod,
			android.R.style.Theme_DeviceDefault_Wallpaper_NoTitleBar,
			android.R.style.Theme_Wallpaper,
			android.R.style.Theme_InputMethod,
			android.R.style.Theme_Wallpaper_NoTitleBar,
			android.R.style.Theme_Wallpaper,
			android.R.style.Theme_Light_Panel,
			android.R.style.Theme_Panel,
			android.R.style.Theme_Wallpaper_NoTitleBar_Fullscreen,
			android.R.style.Theme_WallpaperSettings,
			android.R.style.Theme_Light_WallpaperSettings,
			android.R.style.Theme_WithActionBar,
			android.R.style.Theme_NoTitleBar_OverlayActionModes,
			};
		}
		
		return themes;
	}
	
	static private Map<Integer,String> themes;
}
