package com.bw.vo;

public class TextMessage {

	/*
	 * 接收方帐号（收到的OpenID）
	 */
	private String ToUserName;
	/*
	 * 	开发者微信号
	 */
	private String FromUserName;
	/*
	 * 消息创建时间 （整型）
	 */
	private String CreateTime;
	/*
	 * 	消息类型
	 */
	private String MsgType;
	/*
	 * 	回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	private String Content;
	/*
	 * 	通过素材管理接口上传多媒体文件，得到的id。
	 */
	private String MediaId;
	/*
	 * 	消息的标题
	 */
	private String Title;
	/*
	 * 	消息的描述
	 */
	private String Description;
	/*
	 * 	音乐链接
	 */
	private String MusicURL;
	/*
	 * 	高质量音乐链接，WIFI环境优先使用该链接播放音乐
	 */
	private String HQMusicUrl;
	/*
	 * 	缩略图的媒体id，通过素材管理接口上传多媒体文件，得到的id
	 */
	private String ThumbMediaId;
	/*
	 * 	图文消息个数，限制为10条以内
	 */
	private String ArticleCount;
	/*
	 * 	多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
	 */
	private String Articles;
	/*
	 * 	图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	 */
	private String PicUrl;
	/*
	 * 	点击图文消息跳转链接
	 */
	private String Url;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getMusicURL() {
		return MusicURL;
	}
	public void setMusicURL(String musicURL) {
		MusicURL = musicURL;
	}
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	public String getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(String articleCount) {
		ArticleCount = articleCount;
	}
	public String getArticles() {
		return Articles;
	}
	public void setArticles(String articles) {
		Articles = articles;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}

}
