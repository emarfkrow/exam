package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki1RegistForm.class);

    /** 派生先１登録フォームのリスト */
    @Valid
    private List<Tb6HaseiSaki1RegistForm> tb6HaseiSaki1Grid;

    /**
     * @return 派生先１登録フォームのリスト
     */
    public List<Tb6HaseiSaki1RegistForm> getTb6HaseiSaki1Grid() {
        return tb6HaseiSaki1Grid;
    }

    /**
     * @param p 派生先１登録フォームのリスト
     */
    public void setTb6HaseiSaki1Grid(final List<Tb6HaseiSaki1RegistForm> p) {
        this.tb6HaseiSaki1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
