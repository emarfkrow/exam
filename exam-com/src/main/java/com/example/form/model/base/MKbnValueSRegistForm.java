package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 区分値マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MKbnValueSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKbnValueRegistForm.class);

    /** 区分値マスタ登録フォームのリスト */
    @Valid
    private List<MKbnValueRegistForm> mKbnValueGrid;

    /**
     * @return 区分値マスタ登録フォームのリスト
     */
    public List<MKbnValueRegistForm> getMKbnValueGrid() {
        return mKbnValueGrid;
    }

    /**
     * @param p 区分値マスタ登録フォームのリスト
     */
    public void setMKbnValueGrid(final List<MKbnValueRegistForm> p) {
        this.mKbnValueGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
