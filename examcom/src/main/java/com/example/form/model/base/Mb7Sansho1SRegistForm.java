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
public class Mb7Sansho1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb7Sansho1RegistForm.class);

    /** 参照１マスタ登録フォームのリスト */
    @Valid
    private List<Mb7Sansho1RegistForm> mb7Sansho1Grid;

    /**
     * @return 参照１マスタ登録フォームのリスト
     */
    public List<Mb7Sansho1RegistForm> getMb7Sansho1Grid() {
        return mb7Sansho1Grid;
    }

    /**
     * @param p 参照１マスタ登録フォームのリスト
     */
    public void setMb7Sansho1Grid(final List<Mb7Sansho1RegistForm> p) {
        this.mb7Sansho1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
