package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity1RegistForm.class);

    /** エンティティ１登録フォームのリスト */
    @Valid
    private List<Tb1Entity1RegistForm> tb1Entity1Grid;

    /**
     * @return エンティティ１登録フォームのリスト
     */
    public List<Tb1Entity1RegistForm> getTb1Entity1Grid() {
        return tb1Entity1Grid;
    }

    /**
     * @param p エンティティ１登録フォームのリスト
     */
    public void setTb1Entity1Grid(final List<Tb1Entity1RegistForm> p) {
        this.tb1Entity1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
