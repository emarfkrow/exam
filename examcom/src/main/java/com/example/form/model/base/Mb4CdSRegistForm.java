package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * CDマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Mb4CdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Mb4CdRegistForm.class);

    /** CDマスタ登録フォームのリスト */
    @Valid
    private List<Mb4CdRegistForm> mb4CdGrid;

    /**
     * @return CDマスタ登録フォームのリスト
     */
    public List<Mb4CdRegistForm> getMb4CdGrid() {
        return mb4CdGrid;
    }

    /**
     * @param p CDマスタ登録フォームのリスト
     */
    public void setMb4CdGrid(final List<Mb4CdRegistForm> p) {
        this.mb4CdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
