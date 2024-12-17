package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 区分マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstKbnSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstKbnRegistForm.class);

    /** 区分マスタ登録フォームのリスト */
    @Valid
    private List<MstKbnRegistForm> mstKbnGrid;

    /**
     * @return 区分マスタ登録フォームのリスト
     */
    public List<MstKbnRegistForm> getMstKbnGrid() {
        return mstKbnGrid;
    }

    /**
     * @param p 区分マスタ登録フォームのリスト
     */
    public void setMstKbnGrid(final List<MstKbnRegistForm> p) {
        this.mstKbnGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
