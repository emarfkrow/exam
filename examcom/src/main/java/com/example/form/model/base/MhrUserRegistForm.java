package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ユーザマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MhrUserRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MhrUserRegistForm.class);

    /** ユーザID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    @jp.co.golorp.emarf.validation.PrimaryKeys
    private String userId;

    /**
     * @return ユーザID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param p ユーザID
     */
    public void setUserId(final String p) {
        this.userId = p;
    }

    /** ユーザ姓 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String userSei;

    /**
     * @return ユーザ姓
     */
    public String getUserSei() {
        return userSei;
    }

    /**
     * @param p ユーザ姓
     */
    public void setUserSei(final String p) {
        this.userSei = p;
    }

    /** ユーザ名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String userMei;

    /**
     * @return ユーザ名
     */
    public String getUserMei() {
        return userMei;
    }

    /**
     * @param p ユーザ名
     */
    public void setUserMei(final String p) {
        this.userMei = p;
    }

    /** メールアドレス */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 300)
    private String eMail;

    /**
     * @return メールアドレス
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * @param p メールアドレス
     */
    public void setEMail(final String p) {
        this.eMail = p;
    }

    /** パスワード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 300)
    private String password;

    /**
     * @return パスワード
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param p パスワード
     */
    public void setPassword(final String p) {
        this.password = p;
    }

    /** 適用日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String tekiyoBi;

    /**
     * @return 適用日
     */
    public String getTekiyoBi() {
        return tekiyoBi;
    }

    /**
     * @param p 適用日
     */
    public void setTekiyoBi(final String p) {
        this.tekiyoBi = p;
    }

    /** 終了日 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String shuryoBi;

    /**
     * @return 終了日
     */
    public String getShuryoBi() {
        return shuryoBi;
    }

    /**
     * @param p 終了日
     */
    public void setShuryoBi(final String p) {
        this.shuryoBi = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
