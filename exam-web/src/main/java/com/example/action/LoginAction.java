package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MNinka;
import com.example.entity.MShozoku;
import com.example.entity.MUser;
import com.example.form.LoginForm;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.servlet.LoginFilter;
import jp.co.golorp.emarf.sql.Queries;

/**
 * ログイン
 * @author toshiyuki
 *
 */
public class LoginAction extends BaseAction {

    /** パスワードのハッシュアルゴリズム */
    private static final String HASH = App.get("loginfilter.hash");

    /**
     * ログイン処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String userId = postJson.get("userId").toString();
        String passwd = postJson.get("passwd").toString();

        LoginForm loginForm = this.getLoginForm(userId);

        // 該当データなし
        if (loginForm == null) {
            throw new AppError("error.login");
        }

        // パスワード不一致
        if (!StringUtil.isNullOrBlank(HASH)) {
            passwd = StringUtil.hash(passwd);
        }
        if (!passwd.equals(loginForm.getPasswd())) {
            throw new AppError("error.login");
        }

        // 権限情報取得

        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put(LoginFilter.AUTHN_KEY, userId);
        ret.put(LoginFilter.AUTHN_MEI, loginForm.getAuthnMei());
        ret.put(LoginFilter.AUTHN_INFO, loginForm.getAuthnInfo());
        ret.put(LoginFilter.AUTHZ_INFO, loginForm.getAuthzInfo());

        return ret;
    }

    /**
     * @param userId
     * @return LoginForm
     */
    private LoginForm getLoginForm(final String userId) {

        LoginForm loginForm = null;

        MUser mUser = MUser.get(userId);

        if (mUser != null) {

            loginForm = new LoginForm();

            loginForm.setPasswd(mUser.getPassword());

            loginForm.setAuthnMei(mUser.getUserSei() + " " + mUser.getUserMei());

            ObjectMapper mapper = new ObjectMapper();
            @SuppressWarnings("unchecked")
            Map<String, String> authnInfo = mapper.convertValue(mUser, Map.class);
            loginForm.setAuthnInfo(authnInfo);

            Map<String, String> authzInfo = new HashMap<String, String>();

            // ユーザの所属情報を取得
            String mShozokuSearchSql = this.loadSqlFile("MShozokuSearch");
            Map<String, Object> mShozokuSearchParam = new HashMap<String, Object>();
            mShozokuSearchParam.put("userId", userId);
            List<MShozoku> mShozokus = Queries.select(mShozokuSearchSql, mShozokuSearchParam, MShozoku.class, null,
                    null);

            // 所属情報に紐づく認可情報のうち最大の権限を取得
            if (mShozokus != null) {
                for (MShozoku mShozoku : mShozokus) {

                    String mNinkaSearchSql = this.loadSqlFile("MNinkaSearch");
                    Map<String, Object> mNinkaSearchParam = new HashMap<String, Object>();
                    mNinkaSearchParam.put("bushoId", mShozoku.getBushoId());
                    mNinkaSearchParam.put("shokuiId", mShozoku.getShokuiId());
                    List<MNinka> mNinkas = Queries.select(mNinkaSearchSql, mNinkaSearchParam, MNinka.class, null, null);

                    if (mNinkas != null) {
                        for (MNinka mNinka : mNinkas) {

                            if (!authzInfo.containsKey(mNinka.getKinoNm())) {
                                authzInfo.put(mNinka.getKinoNm(), mNinka.getKengenKb());
                            } else {
                                String orgKengenKb = authzInfo.get(mNinka.getKinoNm());
                                if (Integer.valueOf(orgKengenKb) < Integer.valueOf(mNinka.getKengenKb())) {
                                    authzInfo.put(mNinka.getKinoNm(), mNinka.getKengenKb());
                                }
                            }
                        }
                    }
                }
            }

            loginForm.setAuthzInfo(authzInfo);
        }

        return loginForm;
    }

}
