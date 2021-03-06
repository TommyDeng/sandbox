package com.tom.aspirated.common.bo.wmp.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.tom.aspirated.common.bo.wmp.type.EventType;
import com.tom.aspirated.common.bo.wmp.type.MessageType;

import lombok.ToString;

/**
 * @author TommyDeng <250575979@qq.com>
 * @version 创建时间：2016年9月22日 上午11:26:08
 *
 */
@ToString
@XmlRootElement(name = "xml")
public class MessageXml implements Serializable {
	private static final long serialVersionUID = -1151474720304951311L;
	@XmlElement
	public String ToUserName;
	@XmlElement
	public String FromUserName;
	@XmlElement
	public Long CreateTime;
	@XmlElement
	public MessageType MsgType;
	@XmlElement
	public String Content;
	@XmlElement
	public String MsgId;
	@XmlElement
	public String PicUrl;
	@XmlElement
	public String MediaId;
	@XmlElement
	public String Format;
	@XmlElement
	public String ThumbMediaId;
	@XmlElement
	public String Location_X;
	@XmlElement
	public String Location_Y;
	@XmlElement
	public String Scale;
	@XmlElement
	public String Label;
	@XmlElement
	public String Title;
	@XmlElement
	public String Description;
	@XmlElement
	public String Url;
	@XmlElement
	public EventType Event;
	@XmlElement
	public String EventKey;
	@XmlElement
	public String Ticket;
	@XmlElement
	public String Latitude;
	@XmlElement
	public String Longitude;
	@XmlElement
	public String Precision;
}
