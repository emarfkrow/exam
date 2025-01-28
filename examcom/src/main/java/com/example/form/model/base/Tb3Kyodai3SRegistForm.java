package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟３一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3Kyodai3SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3Kyodai3RegistForm.class);

    /** 兄弟３登録フォームのリスト */
    @Valid
    private List<Tb3Kyodai3RegistForm> tb3Kyodai3Grid;

    /**
     * @return 兄弟３登録フォームのリスト
     */
    public List<Tb3Kyodai3RegistForm> getTb3Kyodai3Grid() {
        return tb3Kyodai3Grid;
    }

    /**
     * @param p 兄弟３登録フォームのリスト
     */
    public void setTb3Kyodai3Grid(final List<Tb3Kyodai3RegistForm> p) {
        this.tb3Kyodai3Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
