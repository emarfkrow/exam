package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照３マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class Mb1Sansho3RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb1Sansho3RegistForm.class);

    /** 参照３NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String sansho3No;

    /**
     * @return 参照３NO
     */
    public String getSansho3No() {
        return sansho3No;
    }

    /**
     * @param p 参照３NO
     */
    public void setSansho3No(final String p) {
        this.sansho3No = p;
    }

    /** 参照３名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String sansho3Mei;

    /**
     * @return 参照３名
     */
    public String getSansho3Mei() {
        return sansho3Mei;
    }

    /**
     * @param p 参照３名
     */
    public void setSansho3Mei(final String p) {
        this.sansho3Mei = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
