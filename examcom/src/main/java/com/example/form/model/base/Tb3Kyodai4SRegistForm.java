package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟４一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3Kyodai4SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3Kyodai4RegistForm.class);

    /** 兄弟４登録フォームのリスト */
    @Valid
    private List<Tb3Kyodai4RegistForm> tb3Kyodai4Grid;

    /**
     * @return 兄弟４登録フォームのリスト
     */
    public List<Tb3Kyodai4RegistForm> getTb3Kyodai4Grid() {
        return tb3Kyodai4Grid;
    }

    /**
     * @param p 兄弟４登録フォームのリスト
     */
    public void setTb3Kyodai4Grid(final List<Tb3Kyodai4RegistForm> p) {
        this.tb3Kyodai4Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
