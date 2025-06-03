package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 長子一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2EldestSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2EldestRegistForm.class);

    /** 長子登録フォームのリスト */
    @Valid
    private List<Tb2EldestRegistForm> tb2EldestGrid;

    /**
     * @return 長子登録フォームのリスト
     */
    public List<Tb2EldestRegistForm> getTb2EldestGrid() {
        return tb2EldestGrid;
    }

    /**
     * @param p 長子登録フォームのリスト
     */
    public void setTb2EldestGrid(final List<Tb2EldestRegistForm> p) {
        this.tb2EldestGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
