package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb7SanshoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb7SanshoRegistForm.class);

    /** 参照マスタ登録フォームのリスト */
    @Valid
    private List<Mb7SanshoRegistForm> mb7SanshoGrid;

    /**
     * @return 参照マスタ登録フォームのリスト
     */
    public List<Mb7SanshoRegistForm> getMb7SanshoGrid() {
        return mb7SanshoGrid;
    }

    /**
     * @param p 参照マスタ登録フォームのリスト
     */
    public void setMb7SanshoGrid(final List<Mb7SanshoRegistForm> p) {
        this.mb7SanshoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
