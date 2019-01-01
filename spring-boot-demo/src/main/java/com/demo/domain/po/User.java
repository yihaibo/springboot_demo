package com.demo.domain.po;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8208186087120537341L;
	
	/**
	 * 用户名
	 */
	@ApiModelProperty(name="userName",value="用户名")
	private String userName;
	
	/**
	 * 用户id
	 */
	@ApiModelProperty(name="userId",value="用户id" ,hidden = true)
	private int userId;
	
	
	/**
	 * 密码
	 */
	@ApiModelProperty(name="passWard",value="密码")
	private String passWard;
	
	/**
	 * 新密码
	 */
	@ApiModelProperty(name="newPassWard",value="新密码")
	private String newPassWard;
	
	/**
	 * 创建时间
	 */
	@ApiModelProperty(hidden = true)
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	@ApiModelProperty(hidden = true)
	private Date updateTime;
	


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPassWard() {
		return passWard;
	}


	public void setPassWard(String passWard) {
		this.passWard = passWard;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public Date getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}


	public String getNewPassWard() {
		return newPassWard;
	}


	public void setNewPassWard(String newPassWard) {
		this.newPassWard = newPassWard;
	}
	
}
