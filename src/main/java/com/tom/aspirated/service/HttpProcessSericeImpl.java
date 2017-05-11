package com.tom.aspirated.service;

import java.net.URI;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tom.aspirated.common.DefaultSetting;

/**
 * @author TommyDeng <250575979@qq.com>
 * @version 创建时间：2016年9月14日 上午11:31:23
 *
 */
@Service
public class HttpProcessSericeImpl implements HttpProcessSerice {

	@Autowired
	DataAccessService dataAccessService;

	@Override
	public String httpGet(URI uri) throws Exception {
		Content content = Request.Get(uri).execute().returnContent();
		return content.asString(DefaultSetting.CHARSET);
	}

	@Override
	public String httpPost(URI uri, Form form) throws Exception {
		Content content = Request.Post(uri).bodyForm(form.build()).execute().returnContent();
		return content.asString(DefaultSetting.CHARSET);
	}

	@Override
	public String httpPost(URI uri, String entityStr) throws Exception {
		Content content = Request.Post(uri).body(new StringEntity(entityStr, DefaultSetting.CHARSET)).execute()
				.returnContent();
		return content.asString(DefaultSetting.CHARSET);
	}

}
