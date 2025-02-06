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
public class Tb5TenseiSakiDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiSakiDetRegistForm.class);

    /** 転生先明細登録フォームのリスト */
    @Valid
    private List<Tb5TenseiSakiDetRegistForm> tb5TenseiSakiDetGrid;

    /**
     * @return 転生先明細登録フォームのリスト
     */
    public List<Tb5TenseiSakiDetRegistForm> getTb5TenseiSakiDetGrid() {
        return tb5TenseiSakiDetGrid;
    }

    /**
     * @param p 転生先明細登録フォームのリスト
     */
    public void setTb5TenseiSakiDetGrid(final List<Tb5TenseiSakiDetRegistForm> p) {
        this.tb5TenseiSakiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
