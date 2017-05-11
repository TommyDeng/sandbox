package com.tom.aspirated.controller.chenluqing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tom.aspirated.common.bo.sys.MapForm;
import com.tom.aspirated.controller.BaseController;

/**
 * 基础平台请求处理
 * 
 * @author TommyDeng <250575979@qq.com>
 * @version 创建时间：2016年9月14日 上午11:29:38
 *
 */

@Controller
public class ChenluqingProfileController extends BaseController {

	@RequestMapping("/chenluqing/wpProfileUpload")
	public String wpMenu(@RequestParam(name = "visitId", required = false) String visitId,
			@RequestParam(name = "visitType", required = false) String visitType, ModelMap map, String AT)
			throws Exception {
		AT = pageInit(AT, visitId, visitType, map);

		MapForm mapForm = new MapForm();
		map.put(SxFormData, mapForm);

		return "/chenluqing/wpProfileUpload";
	}

	
	@RequestMapping("/chenluqing/saveProfile")
	public String saveProfile(@RequestParam(name = "visitId", required = false) String visitId,
			@RequestParam(name = "visitType", required = false) String visitType, ModelMap map, String AT)
			throws Exception {
		AT = pageInit(AT, visitId, visitType, map);

		MapForm mapForm = new MapForm();
		map.put(SxFormData, mapForm);

		return "/chenluqing/wpProfileUpload";
	}
}