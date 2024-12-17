package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 祖先一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1SosenSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1SosenRegistForm.class);

    /** 祖先登録フォームのリスト */
    @Valid
    private List<Tb1SosenRegistForm> tb1SosenGrid;

    /**
     * @return 祖先登録フォームのリスト
     */
    public List<Tb1SosenRegistForm> getTb1SosenGrid() {
        return tb1SosenGrid;
    }

    /**
     * @param p 祖先登録フォームのリスト
     */
    public void setTb1SosenGrid(final List<Tb1SosenRegistForm> p) {
        this.tb1SosenGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
