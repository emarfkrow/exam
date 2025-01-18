package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 祖先明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1SosenDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1SosenDetRegistForm.class);

    /** 祖先明細登録フォームのリスト */
    @Valid
    private List<Tb1SosenDetRegistForm> tb1SosenDetGrid;

    /**
     * @return 祖先明細登録フォームのリスト
     */
    public List<Tb1SosenDetRegistForm> getTb1SosenDetGrid() {
        return tb1SosenDetGrid;
    }

    /**
     * @param p 祖先明細登録フォームのリスト
     */
    public void setTb1SosenDetGrid(final List<Tb1SosenDetRegistForm> p) {
        this.tb1SosenDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
