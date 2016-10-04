package com.test.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -74906200993380354L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer counter = (Integer) ctx.getApplication().get("counter");
		if (null == counter) {
			counter = 1;
		} else {
			counter += 1;
		}
		ctx.getApplication().put("counter", counter);
		ctx.getSession().put("user", getUsername());
		if (getUsername().equals("fiona") && getPassword().equals("123456")) {
			ctx.put("tip", "服务器提示：您已经成功的登入");
			return SUCCESS;
		}
		ctx.put("tip", "服务器提示：登入失败");

		return ERROR;
	}

}
