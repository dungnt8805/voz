package me.keeptable.vozforums.models;

/**
 * Created by vacasol on 9/21/16.
 */

public class BookmarkItem {
    protected static final String SEPARATOR = ";;";
    protected String title;
    protected String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return this.url + SEPARATOR + this.title;
    }

    public static BookmarkItem createItem(String url, String title) {
        BookmarkItem localBookmarkItem = new BookmarkItem();
        localBookmarkItem.setUrl(url);
        localBookmarkItem.setTitle(title);
        return localBookmarkItem;
    }

    public static BookmarkItem parse(String string) {
        String[] arrayOfString = string.split(SEPARATOR);
        if (arrayOfString.length != 2) {
            return null;
        }
        return createItem(arrayOfString[0], arrayOfString[1]);
    }
}
