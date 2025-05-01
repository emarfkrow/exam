package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 派生先２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6HaseiTo2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiTo2RegistForm.class);

    /** 派生先２登録フォームのリスト */
    @Valid
    private List<Tb6HaseiTo2RegistForm> tb6HaseiTo2Grid;

    /**
     * @return 派生先２登録フォームのリスト
     */
    public List<Tb6HaseiTo2RegistForm> getTb6HaseiTo2Grid() {
        return tb6HaseiTo2Grid;
    }

    /**
     * @param p 派生先２登録フォームのリスト
     */
    public void setTb6HaseiTo2Grid(final List<Tb6HaseiTo2RegistForm> p) {
        this.tb6HaseiTo2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
