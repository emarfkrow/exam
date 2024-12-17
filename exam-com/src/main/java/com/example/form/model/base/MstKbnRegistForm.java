package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 区分マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MstKbnRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstKbnRegistForm.class);

    /** 区分名称 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String kbnNm;

    /**
     * @return 区分名称
     */
    public String getKbnNm() {
        return kbnNm;
    }

    /**
     * @param p 区分名称
     */
    public void setKbnNm(final String p) {
        this.kbnNm = p;
    }

    /** 区分名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 120)
    private String kbnMei;

    /**
     * @return 区分名
     */
    public String getKbnMei() {
        return kbnMei;
    }

    /**
     * @param p 区分名
     */
    public void setKbnMei(final String p) {
        this.kbnMei = p;
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

    /** 区分値マスタ */
    @jakarta.validation.Valid
    private List<MstKbnValRegistForm> mstKbnValGrid;

    /**
     * @return 区分値マスタ
     */
    public List<MstKbnValRegistForm> getMstKbnValGrid() {
        return mstKbnValGrid;
    }

    /**
     * @param p
     */
    public void setMstKbnValGrid(final List<MstKbnValRegistForm> p) {
        this.mstKbnValGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
