package me.keeptable.vozforums.models;

/**
 * Created by vacasol on 9/22/16.
 */

public final class Constant {
    public static final String ALLOW_COOKIES = "PHPSESSID|vfimloggedin|vflastvisit|vfpassword|vfuserid|vfsessionhash";
    public static final String CONTENT_TYPE = "text/html";
    public static final String CREATE_EDIT_URL = "https://vozforums.com/editpost.php";
    public static final String CREATE_REPLY_URL = "https://vozforums.com/newreply.php";
    public static final String CREATE_THREAD_URL = "https://vozforums.com/newthread.php";
    public static final String DEFAULT_FONT_SIZE = "1";
    public static final String DEFAULT_THEME = "light";
    public static final String DEFAULT_TITLE = "No-Title";
    public static final String EMPTY_STRING = "";
    public static final String FORUM_URL = "https://vozforums.com/forumdisplay.php";
    public static final String FORUM_URL_TEMPLATE = "https://vozforums.com/forumdisplay.php?f=%d";
    public static final String MESSAGE_404 = "Link not found or removed!";
    public static final String MESSAGE_500 = "<h2 style=\"text-align: center\">Content not found OR connection error.<br/>Please check your network.</h2>";
    public static final String MESSAGE_COOKIE_CLEAR = "Cookie data has been removed.";
    public static final String MESSAGE_DOWNLOAD_COMPLETE = "Image download complete";
    public static final String MESSAGE_LOADING = "Loading...";
    public static final String MESSAGE_LOGIN_FAILURE = "Login unsuccessfully, please try again!";
    public static final String MESSAGE_LOGIN_SUCCESS = "Login successfully!";
    public static final String MESSAGE_POST_FAILED = "Can create new thread, please try again!";
    public static final String MESSAGE_REPLY_FAILED = "Can not post reply, please try again!";
    public static final String MESSAGE_UNKNOWN_LINK = "Invalid Forum or Topic Id";
    public static final String MESSAGE_URL_COPIED = "Current url copied to clipboard";
    public static final String NAME_BOOKMARK = "BOOKMARK";
    public static final String NAME_BOOKMARK_LIST = "BOOKMARK_LIST";
    public static final String NAME_DOWNLOAD_IMAGE = "Save Image";
    public static final String NAME_OPEN_IMAGE = "Open Image";
    public static final String NAME_SETTINGS = "settings";
    public static final String SCRIPT_INTERFACE = "voz";
    public static final String TEMPLATE_COMMON_TITLE = "<div class=\"title\">%s</div>";
    public static final String TEMPLATE_COOKIE = "%s=%s; domain=vozforums.com; path=/";
    public static final String TEMPLATE_CREATE_POST_BUTTON = "<a id=\"createPost\" class=\"btn btnFull\" href=\"%s\">Create New Post</a>";
    public static final String TEMPLATE_CREATE_THREAD_FORM_BEGIN = "<form method=\"post\" action=\"%s\">";
    public static final String TEMPLATE_CREATE_THREAD_FORM_BODY = "<input id=\"subject\" type=\"text\" name=\"subject\" max-length=\"128\" placeholder=\"subject\" value=\"%s\"/><br/><textarea id=\"message\" name=\"message\" onkeyup=\"textAreaAdjust(this);\">%s</textarea><br/><input type=\"button\" value=\"Post New Thread\" onclick=\"doPost();\" />";
    public static final String TEMPLATE_CREATE_THREAD_FORM_END = "</form>";
    public static final String TEMPLATE_CREATE_THREAD_FORM_ERROR = "<div class=\"error\">%s</div>";
    public static final String TEMPLATE_CREATE_THREAD_FORM_HIDDEN_FIELD = "<input type=\"hidden\" name=\"%s\" value=\"%s\" />";
    public static final String TEMPLATE_FORUM_FORUM_ITEM = "<a class=\"itemForum\" href=\"%s\"><h2>%s</h2></a>";
    public static final String TEMPLATE_FORUM_LINK = "forumdisplay.php?f=%d&page=%d";
    public static final String TEMPLATE_FORUM_PAGING = "<nav><strong onclick=\"selectPage();\">%d/%d</strong><a class=\"left\" href=\"%s\">|&lt;&lt;</a><a class=\"left\" href=\"%s\">&lt;&lt;</a><a class=\"right\" href=\"%s\">&gt;&gt;|</a><a class=\"right\" href=\"%s\">&gt;&gt;</a></nav>";
    public static final String TEMPLATE_FORUM_TOPIC_ITEM = "<div class=\"itemTopic\"><a href=\"%s\"><h2>%s</h2></a><span>%s<br/>Last post: %s %s</span><p><span>%d Replies/%d Views</span><a class=\"lastPage\" href=\"%s\">Last page &gt;</a></p></div>";
    public static final String TEMPLATE_FORUM_TOPIC_STICKY_ITEM = "<div class=\"itemTopic sticky\"><a href=\"%s\"><h2>%s</h2></a><span>%s<br/>Last post: %s %s</span><p><span>%d Replies/%d Views</span><a class=\"lastPage\" href=\"%s\">Last page &gt;</a></p></div>";
    public static final String TEMPLATE_HOME_FORUM_ITEM = "<a href=\"%s\" class=\"itemForum\" ><h2>%s</h2><span>%s</span></a>";
    public static final String TEMPLATE_HOME_GROUP_ITEM = "<div class=\"forumGroup\">%s</div>";
    public static final String TEMPLATE_NAME_CREATE_THREAD = "create_thread";
    public static final String TEMPLATE_NAME_FORUM = "forum";
    public static final String TEMPLATE_NAME_HOME = "home";
    public static final String TEMPLATE_NAME_TOPIC = "topic";
    public static final String TEMPLATE_REPLY_BUTTON = "<input type=\"button\" id=\"btnReply\" class=\"btnReply btn btnFull\" value=\"Reply\" onclick=\"showReplyForm();\" />";
    public static final String TEMPLATE_TOPIC_AVATAR = "<img class=\"right\" src=\"%s\" />";
    public static final String TEMPLATE_TOPIC_LINK = "showthread.php?t=%d&page=%d";
    public static final String TEMPLATE_TOPIC_POST_EDIT = "<a class=\"editPost\" href=\"%s\">EDIT</a>";
    public static final String TEMPLATE_TOPIC_POST_FOOTER_CLOSE = "</div>";
    public static final String TEMPLATE_TOPIC_POST_FOOTER_OPEN = "<div class=\"postFooter\">";
    public static final String TEMPLATE_TOPIC_POST_ITEM = "<div class=\"itemPost\"><div class=\"header\"><div class=\"clearFix timeOrder\"><a name=\"post%d\">%s</a><span class=\"right\">#%d</span></div><div class=\"clearFix author\"><div class=\"left\"><div><strong>%s</strong></div><div class=\"info\">%s</div><div class=\"info\">%s<br/>%s</div></div>%s</div></div><div class=\"postContent\">%s %s</div></div>";
    public static final String TEMPLATE_TOPIC_POST_REPLY = "<a class=\"replyPost\" href=\"%s\">QUOTE</a>";
    public static final String TITLE_DOWNLOADING = "Downloading";
    public static final String TOPIC_URL = "https://vozforums.com/showthread.php";
    public static final String TOPIC_URL_TEMPLATE = "https://vozforums.com/showthread.php?t=%d";
    public static final String TYPE_FORUM = "Forum";
    public static final String USER_AGENT = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.0 Safari/537.36";
    public static final String UTF8 = "UTF-8";
    public static final String VOZ_URL = "https://vozforums.com/";
    public static final String VOZ_URL_FULL = "https://vozforums.com/index.php";
}
