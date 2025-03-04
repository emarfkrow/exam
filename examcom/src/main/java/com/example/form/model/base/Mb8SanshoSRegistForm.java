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
public class Mb8SanshoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb8SanshoRegistForm.class);

    /** 参照マスタ登録フォームのリスト */
    @Valid
    private List<Mb8SanshoRegistForm> mb8SanshoGrid;

    /**
     * @return 参照マスタ登録フォームのリスト
     */
    public List<Mb8SanshoRegistForm> getMb8SanshoGrid() {
        return mb8SanshoGrid;
    }

    /**
     * @param p 参照マスタ登録フォームのリスト
     */
    public void setMb8SanshoGrid(final List<Mb8SanshoRegistForm> p) {
        this.mb8SanshoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
