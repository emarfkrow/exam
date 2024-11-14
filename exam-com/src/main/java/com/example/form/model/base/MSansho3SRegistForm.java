package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照３マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSansho3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSansho3RegistForm.class);

    /** 参照３マスタ登録フォームのリスト */
    @Valid
    private List<MSansho3RegistForm> mSansho3Grid;

    /**
     * @return 参照３マスタ登録フォームのリスト
     */
    public List<MSansho3RegistForm> getMSansho3Grid() {
        return mSansho3Grid;
    }

    /**
     * @param p 参照３マスタ登録フォームのリスト
     */
    public void setMSansho3Grid(final List<MSansho3RegistForm> p) {
        this.mSansho3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
