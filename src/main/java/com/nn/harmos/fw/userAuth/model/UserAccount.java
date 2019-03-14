package com.nn.harmos.fw.userAuth.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザアカウントの認証情報を保持するクラス
 * <P>
 * 
 * @author 中島直也
 *
 */
public class UserAccount implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 6264722011096287529L;

	/** ユーザコード */
	private String userCd;

	/** パスワード */
	private String password;

	/** ロールID */
	private String roleId;

	/** 最終ログイン日時 */
	private Date lastLoginDate;

	/** ユーザ名 */
	private String userName;

	/**
	 * ユーザコードを取得する
	 * @return ユーザコード
	 */
	public String getUserCd() {
		return userCd;
	}

	/**
	 * ユーザコードを設定する
	 * @param userCd ユーザコード
	 */
	public void setUserCd(String userCd) {
		this.userCd = userCd;
	}

	/**
	 * パスワードを取得する
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定する
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * ロールIDを取得する
	 * @return ロールID
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * ロールIDを設定する
	 * @param roleId ロールID
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * 最終ログイン日時を取得する
	 * @return 最終ログイン日時
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * 最終ログイン日時を設定する
	 * @param lastLoginDate 最終ログイン日時
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * ユーザ名を取得する
	 * @return ユーザ名
	 */
	public String getUserName() {
	    return userName;
	}

	/**
	 * ユーザ名を設定する
	 * @param userName ユーザ名
	 */
	public void setUserName(String userName) {
	    this.userName = userName;
	}

}
