package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 代表一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2DaihyoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2DaihyoRegistForm.class);

    /** 代表登録フォームのリスト */
    @Valid
    private List<Tb2DaihyoRegistForm> tb2DaihyoGrid;

    /**
     * @return 代表登録フォームのリスト
     */
    public List<Tb2DaihyoRegistForm> getTb2DaihyoGrid() {
        return tb2DaihyoGrid;
    }

    /**
     * @param p 代表登録フォームのリスト
     */
    public void setTb2DaihyoGrid(final List<Tb2DaihyoRegistForm> p) {
        this.tb2DaihyoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
