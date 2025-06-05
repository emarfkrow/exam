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
public class Tb4CdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb4CdRegistForm.class);

    /** CDマスタ登録フォームのリスト */
    @Valid
    private List<Tb4CdRegistForm> tb4CdGrid;

    /**
     * @return CDマスタ登録フォームのリスト
     */
    public List<Tb4CdRegistForm> getTb4CdGrid() {
        return tb4CdGrid;
    }

    /**
     * @param p CDマスタ登録フォームのリスト
     */
    public void setTb4CdGrid(final List<Tb4CdRegistForm> p) {
        this.tb4CdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
