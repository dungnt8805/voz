package me.keeptable.vozforums.models;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by vacasol on 9/22/16.
 */

public class Config {
    protected static final int DEFAULT_FONT_SIZE = 2;
    protected static final String KEY_FONT = "font";
    protected static final String KEY_THEME = "theme";
    public static final String THEME_DARK = "dark";
    public static final String THEME_LIGHT = "light";
    protected static Config instance;

    protected String font;
    protected int fontSize = 2;
    protected SharedPreferences sharedPreferences;
    protected String theme;

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
        this.font = String.valueOf(1.0D + (this.fontSize - 2.0D) / 10.0D);
    }

    public String getTheme() {
        if (this.theme == null) {
            return THEME_LIGHT;
        }
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void getStorage(Context context) {
        this.sharedPreferences = context.getSharedPreferences("settings", 0);
    }

    protected void load() {
        if (this.sharedPreferences == null) {
            setFontSize(this.sharedPreferences.getInt("font", DEFAULT_FONT_SIZE));
            setTheme(this.sharedPreferences.getString("theme", THEME_LIGHT));
        }
    }

    public void save() {
        if (this.sharedPreferences != null) {
            SharedPreferences.Editor localEditor = this.sharedPreferences.edit();
            localEditor.putInt("font", fontSize);
            localEditor.putString("theme", getTheme());
            localEditor.commit();
        }
    }


}
