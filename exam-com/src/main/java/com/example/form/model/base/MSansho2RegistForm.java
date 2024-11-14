package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照２マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSansho2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSansho2RegistForm.class);

    /** 参照２CD */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
    private String sansho2Cd;

    /**
     * @return 参照２CD
     */
    public String getSansho2Cd() {
        return sansho2Cd;
    }

    /**
     * @param p 参照２CD
     */
    public void setSansho2Cd(final String p) {
        this.sansho2Cd = p;
    }

    /** 参照２名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String sansho2Mei;

    /**
     * @return 参照２名
     */
    public String getSansho2Mei() {
        return sansho2Mei;
    }

    /**
     * @param p 参照２名
     */
    public void setSansho2Mei(final String p) {
        this.sansho2Mei = p;
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
