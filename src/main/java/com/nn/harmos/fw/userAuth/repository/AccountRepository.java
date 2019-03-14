package com.nn.harmos.fw.userAuth.repository;

import com.nn.harmos.fw.userAuth.model.UserAccount;

/**
 * 認証機能用リポジトリクラス
 * <P>
 * 
 * @author nakashima
 *
 */
public interface AccountRepository {

	/**
	 * ユーザを1件取得する
	 * 
	 * @param userCd
	 *            ユーザコード
	 * @return
	 */
	UserAccount findOne(String userCd);
}
