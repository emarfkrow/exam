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
public class Tb6HaseiTo1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6HaseiTo1RegistForm.class);

    /** 派生先１登録フォームのリスト */
    @Valid
    private List<Tb6HaseiTo1RegistForm> tb6HaseiTo1Grid;

    /**
     * @return 派生先１登録フォームのリスト
     */
    public List<Tb6HaseiTo1RegistForm> getTb6HaseiTo1Grid() {
        return tb6HaseiTo1Grid;
    }

    /**
     * @param p 派生先１登録フォームのリスト
     */
    public void setTb6HaseiTo1Grid(final List<Tb6HaseiTo1RegistForm> p) {
        this.tb6HaseiTo1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
