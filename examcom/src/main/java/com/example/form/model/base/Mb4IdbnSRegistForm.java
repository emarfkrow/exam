package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * IDBN参照マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4IdbnSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4IdbnRegistForm.class);

    /** IDBN参照マスタ登録フォームのリスト */
    @Valid
    private List<Mb4IdbnRegistForm> mb4IdbnGrid;

    /**
     * @return IDBN参照マスタ登録フォームのリスト
     */
    public List<Mb4IdbnRegistForm> getMb4IdbnGrid() {
        return mb4IdbnGrid;
    }

    /**
     * @param p IDBN参照マスタ登録フォームのリスト
     */
    public void setMb4IdbnGrid(final List<Mb4IdbnRegistForm> p) {
        this.mb4IdbnGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
