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
public class Mb1Sansho3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb1Sansho3RegistForm.class);

    /** 参照３マスタ登録フォームのリスト */
    @Valid
    private List<Mb1Sansho3RegistForm> mb1Sansho3Grid;

    /**
     * @return 参照３マスタ登録フォームのリスト
     */
    public List<Mb1Sansho3RegistForm> getMb1Sansho3Grid() {
        return mb1Sansho3Grid;
    }

    /**
     * @param p 参照３マスタ登録フォームのリスト
     */
    public void setMb1Sansho3Grid(final List<Mb1Sansho3RegistForm> p) {
        this.mb1Sansho3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
