package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生抑止一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiyokushiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiyokushiRegistForm.class);

    /** 転生抑止登録フォームのリスト */
    @Valid
    private List<Tb5TenseiyokushiRegistForm> tb5TenseiyokushiGrid;

    /**
     * @return 転生抑止登録フォームのリスト
     */
    public List<Tb5TenseiyokushiRegistForm> getTb5TenseiyokushiGrid() {
        return tb5TenseiyokushiGrid;
    }

    /**
     * @param p 転生抑止登録フォームのリスト
     */
    public void setTb5TenseiyokushiGrid(final List<Tb5TenseiyokushiRegistForm> p) {
        this.tb5TenseiyokushiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
