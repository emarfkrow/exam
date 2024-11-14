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
public class MKbnSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKbnRegistForm.class);

    /** 区分マスタ登録フォームのリスト */
    @Valid
    private List<MKbnRegistForm> mKbnGrid;

    /**
     * @return 区分マスタ登録フォームのリスト
     */
    public List<MKbnRegistForm> getMKbnGrid() {
        return mKbnGrid;
    }

    /**
     * @param p 区分マスタ登録フォームのリスト
     */
    public void setMKbnGrid(final List<MKbnRegistForm> p) {
        this.mKbnGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
