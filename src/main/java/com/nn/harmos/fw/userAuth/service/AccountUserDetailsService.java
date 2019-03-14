package com.nn.harmos.fw.userAuth.service;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nn.harmos.fw.userAuth.model.UserAccount;
import com.nn.harmos.fw.userAuth.model.UserDetails;
import com.nn.harmos.fw.userAuth.repository.AccountRepository;

/**
 * 
 * ユーザ認証用のサービス
 * <P>
 * Springが提供するUserDetailsServiceインタフェースを実装する。<br>
 * 認証処理自体はSpringに移譲するため、当クラスはユーザ情報を取得することがメインになる。<br>
 * {@link org.springframework.security.core.userdetails.UserDetailsService}<br>
 * 
 * @author nakashima
 *
 */
@Service
@Transactional
public class AccountUserDetailsService implements UserDetailsService {

	@Inject
	AccountRepository accountRepository;

	@Override
	public UserDetails loadUserByUsername(String userCd) throws UsernameNotFoundException {

		UserAccount userAccount = accountRepository.findOne(userCd);

		if (userAccount == null) {
			throw new UsernameNotFoundException("該当のユーザが見つかりません（ ユーザコード：" + userCd + " ）");
		}

		return new UserDetails(userAccount);
	}
}
