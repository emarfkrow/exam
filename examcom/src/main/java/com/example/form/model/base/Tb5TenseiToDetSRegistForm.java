package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生先明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiToDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiToDetRegistForm.class);

    /** 転生先明細登録フォームのリスト */
    @Valid
    private List<Tb5TenseiToDetRegistForm> tb5TenseiToDetGrid;

    /**
     * @return 転生先明細登録フォームのリスト
     */
    public List<Tb5TenseiToDetRegistForm> getTb5TenseiToDetGrid() {
        return tb5TenseiToDetGrid;
    }

    /**
     * @param p 転生先明細登録フォームのリスト
     */
    public void setTb5TenseiToDetGrid(final List<Tb5TenseiToDetRegistForm> p) {
        this.tb5TenseiToDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
