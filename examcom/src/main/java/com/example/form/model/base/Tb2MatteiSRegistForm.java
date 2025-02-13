package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 末弟一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2MatteiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2MatteiRegistForm.class);

    /** 末弟登録フォームのリスト */
    @Valid
    private List<Tb2MatteiRegistForm> tb2MatteiGrid;

    /**
     * @return 末弟登録フォームのリスト
     */
    public List<Tb2MatteiRegistForm> getTb2MatteiGrid() {
        return tb2MatteiGrid;
    }

    /**
     * @param p 末弟登録フォームのリスト
     */
    public void setTb2MatteiGrid(final List<Tb2MatteiRegistForm> p) {
        this.tb2MatteiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
