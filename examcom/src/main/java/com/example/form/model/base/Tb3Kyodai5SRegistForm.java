package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 兄弟５一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb3Kyodai5SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb3Kyodai5RegistForm.class);

    /** 兄弟５登録フォームのリスト */
    @Valid
    private List<Tb3Kyodai5RegistForm> tb3Kyodai5Grid;

    /**
     * @return 兄弟５登録フォームのリスト
     */
    public List<Tb3Kyodai5RegistForm> getTb3Kyodai5Grid() {
        return tb3Kyodai5Grid;
    }

    /**
     * @param p 兄弟５登録フォームのリスト
     */
    public void setTb3Kyodai5Grid(final List<Tb3Kyodai5RegistForm> p) {
        this.tb3Kyodai5Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
