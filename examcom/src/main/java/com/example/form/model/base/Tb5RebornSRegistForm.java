package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5RebornSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5RebornRegistForm.class);

    /** 転生登録フォームのリスト */
    @Valid
    private List<Tb5RebornRegistForm> tb5RebornGrid;

    /**
     * @return 転生登録フォームのリスト
     */
    public List<Tb5RebornRegistForm> getTb5RebornGrid() {
        return tb5RebornGrid;
    }

    /**
     * @param p 転生登録フォームのリスト
     */
    public void setTb5RebornGrid(final List<Tb5RebornRegistForm> p) {
        this.tb5RebornGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
