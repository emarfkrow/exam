package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照２マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb1Sansho2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb1Sansho2RegistForm.class);

    /** 参照２マスタ登録フォームのリスト */
    @Valid
    private List<Mb1Sansho2RegistForm> mb1Sansho2Grid;

    /**
     * @return 参照２マスタ登録フォームのリスト
     */
    public List<Mb1Sansho2RegistForm> getMb1Sansho2Grid() {
        return mb1Sansho2Grid;
    }

    /**
     * @param p 参照２マスタ登録フォームのリスト
     */
    public void setMb1Sansho2Grid(final List<Mb1Sansho2RegistForm> p) {
        this.mb1Sansho2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
