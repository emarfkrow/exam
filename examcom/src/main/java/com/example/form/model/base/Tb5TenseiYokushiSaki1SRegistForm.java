package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生抑止先１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiYokushiSaki1RegistForm.class);

    /** 転生抑止先１登録フォームのリスト */
    @Valid
    private List<Tb5TenseiYokushiSaki1RegistForm> tb5TenseiYokushiSaki1Grid;

    /**
     * @return 転生抑止先１登録フォームのリスト
     */
    public List<Tb5TenseiYokushiSaki1RegistForm> getTb5TenseiYokushiSaki1Grid() {
        return tb5TenseiYokushiSaki1Grid;
    }

    /**
     * @param p 転生抑止先１登録フォームのリスト
     */
    public void setTb5TenseiYokushiSaki1Grid(final List<Tb5TenseiYokushiSaki1RegistForm> p) {
        this.tb5TenseiYokushiSaki1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
