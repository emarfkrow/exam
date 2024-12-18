package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照１マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb1Sansho1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb1Sansho1RegistForm.class);

    /** 参照１マスタ登録フォームのリスト */
    @Valid
    private List<Mb1Sansho1RegistForm> mb1Sansho1Grid;

    /**
     * @return 参照１マスタ登録フォームのリスト
     */
    public List<Mb1Sansho1RegistForm> getMb1Sansho1Grid() {
        return mb1Sansho1Grid;
    }

    /**
     * @param p 参照１マスタ登録フォームのリスト
     */
    public void setMb1Sansho1Grid(final List<Mb1Sansho1RegistForm> p) {
        this.mb1Sansho1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
