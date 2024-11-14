package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 機能マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MKinoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKinoRegistForm.class);

    /** 機能マスタ登録フォームのリスト */
    @Valid
    private List<MKinoRegistForm> mKinoGrid;

    /**
     * @return 機能マスタ登録フォームのリスト
     */
    public List<MKinoRegistForm> getMKinoGrid() {
        return mKinoGrid;
    }

    /**
     * @param p 機能マスタ登録フォームのリスト
     */
    public void setMKinoGrid(final List<MKinoRegistForm> p) {
        this.mKinoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
