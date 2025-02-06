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
public class Tb5TenseiYokushiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiYokushiRegistForm.class);

    /** 転生抑止登録フォームのリスト */
    @Valid
    private List<Tb5TenseiYokushiRegistForm> tb5TenseiYokushiGrid;

    /**
     * @return 転生抑止登録フォームのリスト
     */
    public List<Tb5TenseiYokushiRegistForm> getTb5TenseiYokushiGrid() {
        return tb5TenseiYokushiGrid;
    }

    /**
     * @param p 転生抑止登録フォームのリスト
     */
    public void setTb5TenseiYokushiGrid(final List<Tb5TenseiYokushiRegistForm> p) {
        this.tb5TenseiYokushiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
