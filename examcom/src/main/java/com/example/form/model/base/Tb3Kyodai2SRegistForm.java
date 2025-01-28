package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3Kyodai2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3Kyodai2RegistForm.class);

    /** 兄弟２登録フォームのリスト */
    @Valid
    private List<Tb3Kyodai2RegistForm> tb3Kyodai2Grid;

    /**
     * @return 兄弟２登録フォームのリスト
     */
    public List<Tb3Kyodai2RegistForm> getTb3Kyodai2Grid() {
        return tb3Kyodai2Grid;
    }

    /**
     * @param p 兄弟２登録フォームのリスト
     */
    public void setTb3Kyodai2Grid(final List<Tb3Kyodai2RegistForm> p) {
        this.tb3Kyodai2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
