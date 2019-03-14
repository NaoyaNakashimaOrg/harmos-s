package com.nn.harmos.fw.userAuth.model;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

/**
 * ユーザ定義用のクラス
 * <P>
 * Springが提供する、UserDetailsインタフェースを実装したUserクラスを継承し、<br>
 * 本プロジェクト用のUserDetailsクラスを実装する。<br>
 * 参照：{@link org.springframework.security.core.userdetails.UserDetails}<br>
 * 参照：{@link org.springframework.security.core.userdetails.User}<br>
 * 
 * @author nakashima
 *
 */
public class UserDetails extends User {

	/** serialVersionUID */
	private static final long serialVersionUID = 7770159072008163534L;

	/** ユーザアカウント */
	private final UserAccount userAccount;

	/**
	 * コンストラクタ
	 * 
	 * @param userAccount
	 */
	public UserDetails(UserAccount userAccount) {

		// Userクラスのコンストラクタを呼び出す。
		// 第1引数はユーザー名、第2引数はパスワード、第3引数は権限リストである。
		super(userAccount.getUserCd(), userAccount.getPassword(),
				AuthorityUtils.createAuthorityList(userAccount.getRoleId()));
		this.userAccount = userAccount;
	}

	/**
	 * ユーザアカウントを取得する
	 * 
	 * @return
	 */
	public UserAccount getUserAccount() {
		return userAccount;
	}
}
