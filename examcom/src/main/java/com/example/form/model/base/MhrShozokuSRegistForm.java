package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 所属マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MhrShozokuSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MhrShozokuRegistForm.class);

    /** 所属マスタ登録フォームのリスト */
    @Valid
    private List<MhrShozokuRegistForm> mhrShozokuGrid;

    /**
     * @return 所属マスタ登録フォームのリスト
     */
    public List<MhrShozokuRegistForm> getMhrShozokuGrid() {
        return mhrShozokuGrid;
    }

    /**
     * @param p 所属マスタ登録フォームのリスト
     */
    public void setMhrShozokuGrid(final List<MhrShozokuRegistForm> p) {
        this.mhrShozokuGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
