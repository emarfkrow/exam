package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先１明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki1DetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiSaki1DetRegistForm.class);

    /** 派生先１明細登録フォームのリスト */
    @Valid
    private List<Tb6HaseiSaki1DetRegistForm> tb6HaseiSaki1DetGrid;

    /**
     * @return 派生先１明細登録フォームのリスト
     */
    public List<Tb6HaseiSaki1DetRegistForm> getTb6HaseiSaki1DetGrid() {
        return tb6HaseiSaki1DetGrid;
    }

    /**
     * @param p 派生先１明細登録フォームのリスト
     */
    public void setTb6HaseiSaki1DetGrid(final List<Tb6HaseiSaki1DetRegistForm> p) {
        this.tb6HaseiSaki1DetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
