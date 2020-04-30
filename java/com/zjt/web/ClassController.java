package com.zjt.web;

import com.github.pagehelper.PageHelper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.zjt.entity.Tclass;
import com.zjt.entity.Tmenu;
import com.zjt.entity.Trole;
import com.zjt.entity.Tuser;
import com.zjt.model.JqgridBean;
import com.zjt.model.PageRusult;
import com.zjt.service.TclassService;
import com.zjt.service.TmenuService;
import com.zjt.service.TroleService;
import com.zjt.service.TuserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
* @Author: Zhaojiatao
* @Description: 当前登录用户控制器
* @Date: Created in 2018/2/8 19:28
* @param
*/
@Controller
@RequestMapping("/admin/class")
public class ClassController extends BaseContrller{

	@Resource
	private TclassService tclassService;

	@RequestMapping("/selectclass")
	@RequiresPermissions(value = {"班级"})
	public String tousermanage() {
		return "power/class";
	}
	@RequestMapping("/selectclass1")
	@ResponseBody
	//@RequiresPermissions(value = {"班级"})

	public Map<String, Object> list(JqgridBean jqgridbean
			/*String userName,@RequestParam(value="page",required=false)Integer page*/
	) throws Exception {
		LinkedHashMap<String, Object> resultmap = new LinkedHashMap<String, Object>();

		Example troleExample = new Example(Tclass.class);
		//tuserExample.or().andIdNotEqualTo(1L);
		Example.Criteria criteria = troleExample.or();

		if (StringUtils.isNotEmpty(jqgridbean.getSearchField())) {
			if ("name".equalsIgnoreCase(jqgridbean.getSearchField())) {
				if ("eq".contentEquals(jqgridbean.getSearchOper())) {
					criteria.andEqualTo("name",jqgridbean.getSearchString());
				}
			}
		}

		PageHelper.startPage(jqgridbean.getPage(), jqgridbean.getLength());
		List<Tclass> classList = tclassService.selectByExample(troleExample);
		PageRusult<Tclass> pageRusult =new PageRusult<Tclass>(classList);



		resultmap.put("currpage", String.valueOf(pageRusult.getPageNum()));
		resultmap.put("totalpages", String.valueOf(pageRusult.getPages()));
		resultmap.put("totalrecords", String.valueOf(pageRusult.getTotal()));
		resultmap.put("datamap", classList);

		return resultmap;
	}

}


